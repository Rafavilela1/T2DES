package br.com.senai.rafaelvilela.application.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.senai.rafaelvilela.jpa.ejbbean.DespesasBean;
import br.com.senai.rafaelvilela.jpa.model.Despesas;


@SuppressWarnings("serial") //tira o aviso de cuidado do Eclipse
@SessionScoped //tempo de vida da página, o session mantem os dados enquanto o navegador estiver aberto
@Named("tabela") //como o bean vai ser chamado

public class PageBean implements Serializable{

	@EJB
	private DespesasBean despesabean; //Váriavel que vai fazer a conexão com o EJB
	
	private Integer despesaID; //ID das despesas
	
	private List<Despesas> despesas = new ArrayList<>();//recebe a lista chamada 'despesa' e grava na tabela
	
	String data;
	String descricao;
	Double valor;
	Boolean back = false;
			
		
	public String getData() {
			return data;
	}
	public void setData(String data) {
			this.data = data;
	}
	public String getDescricao() {
			return descricao;
	}
	public void setDescricao(String descricao) {
			this.descricao = descricao;
	}
	public Double getValor() {
			return valor;
	}
	public void setValor(Double valor) {
			this.valor = valor;
	}
	
	public Boolean getBack() {
		return back;
	}
	public void setBack(Boolean back) {
		this.back = back;
	}
	
	//cria novo objeto dentro da tabela 
	public String inserir(String data, String descricao, Double valor) {
		Despesas d = new Despesas(data, descricao, valor);
		d.setEdit(true);
		back = true;
		despesabean.inserir(d);
		despesas.add(d);
		data = null;
		descricao = null;
		valor = null;
		return null;
	}
	
	//remove a despesa dentro da tabela
	public void excluir(Despesas despesa) {
		despesabean.excluir(despesa);
		despesas = null;
	}
	
	//muda a forma que manipula a tabela, fazendo com que seja possivel alterar as informações já inseridas na tabela
	public String editar(Despesas despesa) { 
		despesa.setEdit(true);
		
		return null;
	}
	
	//muda a forma que manipula a tabela
	public String gravar(Despesas despesa) { 
		despesa.setEdit(false);
		return null;
	}
	
	//mostra todas as depesas da tabela
	public List<Despesas> getDespesas(){
		if(despesas==null) {
			 List<Despesas> despesas = new ArrayList<>();
		}
		return despesas;
	}
}