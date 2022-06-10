package br.com.senai.rafaelvilela.application.bean;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import br.com.senai.rafaelvilela.jpa.ejbbean.DespesasBean;
import br.com.senai.rafaelvilela.jpa.model.Despesas;




@SuppressWarnings("serial") //Tira os sinais de aviso
@Named("tabela") //"apelido" do bean
@SessionScoped //tempo de vida da pagina
public class PageBean implements Serializable{
	//Lista com objetos
	private List<Despesas> despesas = new ArrayList<>();
	

	//declaração das variaveis
	String data1;
	String desc1;
	Double Valor1;
	Boolean back = false; 
	
	private Despesas despesas1;
	
	@EJB //faz o relacionamento com o banco de dados
	private DespesasBean despesaBean;
	
	
	//getter e setter
	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public Double getValor1() {
		return Valor1;
	}

	public void setValor1(Double valor1) {
		Valor1 = valor1;
	}

	
	//grava, edita e exclui os itens
	public void gravarBanco(Despesas d) {
		despesaBean.inserir(d);
		
	}
	
	public void ExcluirBanco(Despesas d) {
		despesaBean.excluir(d);
		
	}
	public void EditarBanco(Despesas d) {
		despesaBean.atualizar(d);
		
	}
	

	
	
	//Pega as informações inseridas e as coloca em variáveis. Após isso, coloca essas variáveis em um objeto e insere na lista.
	public String inserir(String data,String desc,Double Valor) {
		
		Despesas d = new Despesas(data,desc,Valor);
		d.setEdit(true);
		back =true;
		despesas.add(d);
		data1 = null;
		desc1 = null;
		Valor1= null;
		
		gravarBanco(d);
		
		return null;

	}
	
	
	//grava, edita e exclui os itens
	public String excluir(Despesas despesa) {
		//removendo o objeto da lista 
		despesas.remove(despesa);
		ExcluirBanco(despesa);
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true); 
		EditarBanco(despesa);
		return null;
	}
	
	public String gravar (Despesas despesa) {
		despesa.setEdit(false);
		if(despesa.getId()==null) {
			despesaBean.inserir(despesa);
		}else {
			despesaBean.atualizar(despesa);
		}
		return null;
	}
	
	//retorna a tabela de despesas
	public List<Despesas> getDespesas() {
		return despesas;
	}
	
	public Despesas getDespesas1() {
		if(despesas1==null) {
			despesas1 = new Despesas();
		}
		return despesas1;
	}

	
	//getter e setter
	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

}
