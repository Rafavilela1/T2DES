package br.com.senai.rafaelvilela.application;




import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.senai.rafaelvilela.model.Linguagem;

@SuppressWarnings("serial") //Tira os sinais de aviso
@Named("cadastro") //"apelido" do Bean
@RequestScoped //funciona enquanto a página esta aberta


public class CadastroBean implements Serializable{
	//Declaração de Variável
	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private String sexo;
	private Boolean receberEmails;
	private String observacoes;
	private Integer[] linguagens;

	public Linguagem[] getListaLinguagens() {
		return Linguagem.LINGUAGENS;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Boolean getReceberEmails() {
		return receberEmails;
	}
	public void setReceberEmails(Boolean receberEmails) {
		this.receberEmails = receberEmails;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}


	//Transformação em String
	public String getLinguagensAsString() {

		String str="";
		boolean first = true;
		for(Integer linguagem : linguagens) {
			if(!first) {
				str += ",";
			}
			str += Linguagem.LINGUAGENS[linguagem].getNome();
			first = false;
		}

		return str;
	}




}
