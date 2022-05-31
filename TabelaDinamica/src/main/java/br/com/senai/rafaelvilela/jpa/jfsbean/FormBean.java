package br.com.senai.rafaelvilela.jpa.jfsbean;


import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.senai.rafaelvilela.jpa.ejbbean.DespesasBean;
import br.com.senai.rafaelvilela.jpa.model.Despesas;


@Named("form")
@RequestScoped
public class FormBean implements Serializable {
	
	@EJB
	private DespesasBean despesasBean;

	@Inject
	private FacesContext context;
	
	private UIComponent searchInputText;
	
	private Integer despesasId;
	
	private Despesas despesas;
	
	public void gravar(AjaxBehaviorEvent event) {
		if(despesas.getId()==null) {
			despesasBean.inserir(despesas);
		}else {
			despesasBean.atualizar(despesas);
		}		
	}
	
	public void pesquisar(AjaxBehaviorEvent event) {
		despesas = despesasBean.carregar(despesasId);
		
		if(despesas == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Tarefa n�o encontrada"));
		}
		despesasId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		despesasBean.excluir(despesas);
		despesas = null;
	}
	public Despesas getDespesas() {
		if(despesas==null) {
			despesas = new Despesas();
		}
		return despesas;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getDespesasId() {
		return despesasId;
	}

	public void setDespesasId(Integer despesasId) {
		this.despesasId = despesasId;
	}
	
	
	
}
