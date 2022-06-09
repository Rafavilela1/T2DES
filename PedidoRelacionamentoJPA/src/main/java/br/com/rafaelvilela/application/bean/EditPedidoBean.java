package br.com.rafaelvilela.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rafaelvilela.application.ejb.ClienteBean;
import br.com.rafaelvilela.application.ejb.PedidoBean;
import br.com.rafaelvilela.application.ejb.ProdutoBean;
import br.com.rafaelvilela.application.model.Cliente;
import br.com.rafaelvilela.application.model.Produto;


@Named
@RequestScoped
public class EditPedidoBean implements Serializable {
	
	@EJB //faz o relacionamento com o banco de dados
	private PedidoBean pedidoBean;
	
	@EJB
	private ProdutoBean produtoBean;
	
	@EJB
	
	private ClienteBean clienteBean;
	
	private List<Cliente> clientes;
	
	private List<Produto> produtos;
	
	private Integer selectedClienteId;

	private Integer[] selectedProdutosIds;
	
	

	@PostConstruct //Ocorre após o inicio da construção do Bean
	public void init() {
		clientes = clienteBean.listar();
		produtos = produtoBean.listar();
	}
	//cadastra as informações com base nos IDs
	public String cadastrarPedido() throws Exception {
		pedidoBean.cadastrar(selectedClienteId, selectedProdutosIds);
		return "pedidos?faces-redirect=true";
	}
	 
	
	//getter e setter
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