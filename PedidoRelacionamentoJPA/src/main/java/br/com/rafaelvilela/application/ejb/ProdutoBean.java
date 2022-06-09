package br.com.rafaelvilela.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelvilela.application.model.Produto;

@Stateless
public class ProdutoBean {

	@PersistenceContext
	private EntityManager em;
	//lista os produtos
	public List<Produto> listar() {
		return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}
}
