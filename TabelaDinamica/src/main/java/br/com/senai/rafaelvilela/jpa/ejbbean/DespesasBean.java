package br.com.senai.rafaelvilela.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.rafaelvilela.jpa.model.Despesas;



@Stateless
public class DespesasBean {

	@PersistenceContext
	//Faz o Biding com o banco de dados
	private EntityManager em;
	
	
	//insere atualiza e exclui as informações no banco de dados
	public void inserir(Despesas despesas) {
		em.persist(despesas);
	}
	
	public void atualizar(Despesas despesas) {
		em.merge(despesas);
	}
	
	public void excluir(Despesas despesas) {
		despesas = carregar(despesas.getId());
		em.remove(despesas);
	}
	
	public Despesas carregar(int id) {
		return em.find(Despesas.class, id);
	}
}
