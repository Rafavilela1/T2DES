package br.com.senai.rafaelvilela.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.rafaelvilela.application.model.Despesas;

@Named("tabela")
@SessionScoped
public class PageBean implements Serializable {
	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	
	public String inserir() {
		Despesas d = new Despesas();
		d.setEdit(true);
		despesasList.add(d);
		
		
		return null;
	}
	
	
	public String excluir(Despesas despesa) {
		despesasList.remove(despesa);
		return null;
	}
	public String editar(Despesas despesa) {
		despesa.setEdit(true);
		return null;
	}
	public String gravar(Despesas despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	public String listaDataModel(Despesas despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	
	
	
	
	public ListDataModel<Despesas> getDespesas() {
		
		return despesas;
	}


}
