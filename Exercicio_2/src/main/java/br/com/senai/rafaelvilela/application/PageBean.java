package br.com.senai.rafaelvilela.application;


import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;


@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean {
	//declara as variáveis
	String texto;
	String invertido;
	
	
	//getter e setter
	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public String getInvertido() {
		return invertido;
	}


	public void setInvertido(String invertido) {
		this.invertido = invertido;
	}
	@Inject
	private Flash flash;
	//Inverte o texto
	public String inversao() {
		String invertido = new StringBuilder(texto).reverse().toString();
		flash.put("result", invertido);
		return "result"; //vai para a página de resultado
	}

}
