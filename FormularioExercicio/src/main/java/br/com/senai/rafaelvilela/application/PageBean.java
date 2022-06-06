package br.com.senai.rafaelvilela.application;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.rafaelvilela.application.business.Constantes;
import br.com.senai.rafaelvilela.application.model.Endereco;
import br.com.senai.rafaelvilela.application.model.Estado;
import br.com.senai.rafaelvilela.application.model.Interesse;
import br.com.senai.rafaelvilela.application.model.Pessoa;
import br.com.senai.rafaelvilela.application.model.Telefone;

@Named()
@RequestScoped
public class PageBean implements Serializable {

	private Pessoa pessoa;
	//Atribui os dados cadastrados ao objeto abaixo
	public Pessoa getPessoa() {

		if (pessoa == null) {
			pessoa = new Pessoa();
			pessoa.setEndRes(new Endereco());
			pessoa.getEndRes().setEstado(new Estado());
			pessoa.setEndCom(new Endereco());
			pessoa.getEndCom().setEstado(new Estado());
			pessoa.setTelRes(new Telefone());
			pessoa.setTelCel(new Telefone());
			pessoa.setTelCom(new Telefone());
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Estado> getEstados() {
		return Constantes.ESTADOS;
	}

	public List<Interesse> getInteresse() {
		return Constantes.INTERESSES;
	}
}
