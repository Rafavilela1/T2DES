package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rafaelcosta.application.ejb.ClienteBean;
import br.com.rafaelcosta.application.ejb.PedidoBean;
import br.com.rafaelcosta.application.ejb.ProdutoBean;
import br.com.rafaelcosta.application.model.Cliente;
import br.com.rafaelcosta.application.model.Produto;


@Named
@RequestScoped
public class EditPedidoBean implements Serializable {
	
	@EJB //faz o relacionamento com o banco de dados
	private PedidoBean pedidoBean;
	
	@EJB//faz o relacionamento com o banco de dados
	private ProdutoBean produtoBean;
	
	@EJB//faz o relacionamento com o banco de dados
	
	//lista os clientes e produtos
	private ClienteBean clienteBean;
	
	private List<Cliente> clientes;
	
	private List<Produto> produtos;
	
	private Integer selectedClienteId;

	private Integer[] selectedProdutosIds;
	
	

	@PostConstruct //sua execução é realizada após o inicio da construção do Bean
	public void init() {
		clientes = clienteBean.listar();
		produtos = produtoBean.listar();
	}
	//cadastra as informações com base nos IDs
	public String cadastrarPedido() throws Exception {
		pedidoBean.cadastrar(selectedClienteId, selectedProdutosIds);
		//vai para a tela de dados
		return "pedidos?faces-redirect=true";
	}
	 
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Integer getSelectedClienteId() {
		return selectedClienteId;
	}

	public void setSelectedClienteId(Integer selectedClienteId) {
		this.selectedClienteId = selectedClienteId;
	}

	public Integer[] getSelectedProdutosIds() {
		return selectedProdutosIds;
	}

	public void setSelectedProdutosIds(Integer[] selectedProdutosIds) {
		this.selectedProdutosIds = selectedProdutosIds;
	}
}