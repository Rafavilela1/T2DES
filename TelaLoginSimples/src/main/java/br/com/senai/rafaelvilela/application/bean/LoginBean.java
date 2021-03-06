package br.com.senai.rafaelvilela.application.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean implements Serializable{
	private String nome,senha;

	//avisa o console que será construido
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado");
	}
	
	//avisa o console que será construido
	@PreDestroy
	public void onDestroy() {
		System.out.println("Bean será destruido");
	}
	
	//valida as informações do Login
	public String doLogin() {
		if("abc".equals(nome) && "123".equals(senha)) {
			return "sucesso";
		}
		return null;
	}
	
	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}	
