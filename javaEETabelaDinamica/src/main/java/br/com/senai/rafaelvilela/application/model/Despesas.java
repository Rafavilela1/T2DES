package br.com.senai.rafaelvilela.application.model;

import java.util.Date;

public class Despesas {
	//declaração de variável
	private String descricao;
	private Double valor;
	private boolean edit;
	private String data;
	
	
	//getter e setter
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
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
