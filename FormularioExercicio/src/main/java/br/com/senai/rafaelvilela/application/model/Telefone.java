package br.com.senai.rafaelvilela.application.model;

public class Telefone {
	
	
	public enum Tipo {
		FIXO, CELULAR
	}

	private String ddd,num;
	private Tipo tipo;
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	

	

}

