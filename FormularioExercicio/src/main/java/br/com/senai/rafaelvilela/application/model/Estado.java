package br.com.senai.rafaelvilela.application.model;


public class Estado {
	//Declaração de Variavel
	private String nome,sigla;
	public Estado() {
	}

	//Construtor
	public Estado(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	
	//getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
