package br.com.senai.rafaelvilela.application;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;


@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean {
	///declaração de variável
	private String nome;

	@Inject //injeta um tipo de variável no java
	private Flash flash;
	
	
	public String processar() {
		//coloca o inserido pelo usuário na outra página
		flash.put("nomeDoUsuario", nome);
		return "result?faces-redirect=true";
	}

	
	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
