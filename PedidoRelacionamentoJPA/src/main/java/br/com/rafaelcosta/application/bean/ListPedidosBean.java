package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rafaelcosta.application.ejb.PedidoBean;
import br.com.rafaelcosta.application.model.Pedido;


@Named
@RequestScoped
//lista Os pedidos
public class ListPedidosBean implements Serializable {

	@EJB
	private PedidoBean pedidoBean;
	
	private List<Pedido> pedidos;
	//carrega os pedidos
	@PostConstruct
	public void init() {
		pedidos = pedidoBean.listar();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	//Retorna a forma de pagamento
	public String pagar(Integer pedidoId, String tipo) throws Exception  {
		pedidoBean.pagar(pedidoId, tipo);
		//atualiza a página
		return "pedidos?faces-redirect=true";
	}
	//a partir do Id pega e exclui informações
	public String excluir(Integer pedidoId) {
		
		pedidoBean.excluir(pedidoId);
		//atualiza a página 
		return "pedidos?faces-redirect=true";
	}
}
