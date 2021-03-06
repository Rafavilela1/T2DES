package br.com.senai.rafaelvilela.application;



import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;


@SuppressWarnings("serial")
@Named    //Permite que a classe seja chamada por outro nome determinado pelo usuário
@RequestScoped     //Permite o funcionamento da classe enquanto estiver sendo usada
public class PageBean {
	//declaração de variável
	private int num1,num2,num3;

	@Inject //injeta um tipo de variável no java
	private Flash flash;
	
	

	//getter e setter (pegam valor de uma variavel privada ; atribuem valor)
	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int getNum3() {
		return num3;
	}


	public void setNum3(int num3) {
		this.num3 = num3;
	}

	
	public String somar() {
		//operação de soma
		flash.put("resp", (num1+num2+num3));
		
		
		return "result";
	}

}
