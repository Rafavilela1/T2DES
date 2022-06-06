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
	//arrayList
	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	
	//Método para inserir itens
	public String inserir() {
		Despesas d = new Despesas();
		d.setEdit(true);
		despesasList.add(d);
		
		
		return null;
	}
	
	//Método para excluir itens
	public String excluir(Despesas despesa) {
		despesasList.remove(despesa);
		return null;
	}
	//Método para editar itens
	public String editar(Despesas despesa) {
		despesa.setEdit(true);
		return null;
	}
	//Método para gravar itens
	public String gravar(Despesas despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	public String listaDataModel(Despesas despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	
	
	
	//(listaDataModel) - tipo de lista que trabalha com jsf
	public ListDataModel<Despesas> getDespesas() {
		
		return despesas;
	}


}
