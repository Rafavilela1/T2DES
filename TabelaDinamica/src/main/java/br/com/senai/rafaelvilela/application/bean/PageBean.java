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




@SuppressWarnings("serial") //tira anuncios de advert�ncia
@Named("tabela")
@SessionScoped //tempo de vida da p�gina, o "session" mant�m os dados enquanto o navegador estiver aberto
public class PageBean implements Serializable{
	//Criando uma Lista com todos os objetos
	private List<Despesas> despesas = new ArrayList<>();
	
	//Vari�veis que ir� receber as informa��es do formul�rio e ir� enviar para a classe "Despesas"
	private String user;
	private String senha;
	
	String data1;
	String desc1;
	Double Valor1;
	Boolean back = false; 
	
	private Despesas despesas1;
	
	@EJB
	private DespesasBean despesaBean;
	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

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

	
	public void gravarBanco(Despesas d) {
		despesaBean.inserir(d);
		
	}
	
	public void ExcluirBanco(Despesas d) {
		despesaBean.excluir(d);
		
	}
	public void EditarBanco(Despesas d) {
		despesaBean.atualizar(d);
		
	}
	

	
	
	
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
	
	public List<Despesas> getDespesas() {
		return despesas;
	}
	
	public Despesas getDespesas1() {
		if(despesas1==null) {
			despesas1 = new Despesas();
		}
		return despesas1;
	}

	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}
	public String doLogin() {
		
		if("willian".equals(user) && "admin".equals(senha)) {
			return "despesas";	
		}
		return null;
	}
	
}
