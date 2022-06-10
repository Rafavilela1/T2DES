package br.com.senai.rafaelvilela.application.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@SuppressWarnings("serial") //Tira os sinais de aviso
@Named //"apelido" do bean
@RequestScoped //funciona enquanto a página esta aberta

public class LoginBean implements Serializable{
	//Declaração das variáveis
	private String nome,senha;
	
	//Valida o login
	public String doLogin() {
		if("abc".equals(nome) && "123".equals(senha)) {
			return "Despesas";
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