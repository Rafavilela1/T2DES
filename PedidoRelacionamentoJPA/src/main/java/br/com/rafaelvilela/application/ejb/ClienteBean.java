package br.com.rafaelvilela.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelvilela.application.model.Cliente;

//tempo de vida do EJB
@Stateless
public class ClienteBean {

	@PersistenceContext
	private EntityManager em;
	//Seleciona os itens que serão listados
	
	public List<Cliente> listar() { //transforma o objeto em uma tabela
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}
