package br.com.rafaelvilela.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelvilela.jpa.model.Tarefa;

@Stateless
public class TarefaBean {

	//faz o dados persistirem no banco de dados
	@PersistenceContext
	private EntityManager em;

	//inserir informacoes
	public void inserir(Tarefa tarefa) {
		em.persist(tarefa);
	}

	//atualizar informações
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}

	//excluir informações
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}

	//carregar informacoes
	public Tarefa carregar(int id) {
		return em.find(Tarefa.class, id);
	}
}
