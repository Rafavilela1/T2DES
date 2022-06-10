package br.com.senai.rafaelvilela.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //Cria a tabela
public class Produtos {
	
	//Geram IDs automaticamente
	@Id
	@GeneratedValue
	
	
	//declaração das variáveis
	private Integer id;
	private String nome;
	private Double valor;
	
	//getter e setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
