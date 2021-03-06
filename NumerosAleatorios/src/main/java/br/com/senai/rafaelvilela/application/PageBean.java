package br.com.senai.rafaelvilela.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable {
	//instancia o método random
	private static Random random = new Random();
	//declaração de variável
	private Integer qtde;
	private Integer min;
	private Integer max;
	


	//getter e setter
	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	private List<Integer> num = new ArrayList<>();
	public List<Integer> getNum() {
		return num;
	}

	public void setNumeros(List<Integer> num) {
		this.num = num;
	}
	
	
	//gera números aleatórios
public String geradordeNumeros() {
		
		for (int i = 0; i < qtde; i++) {
			int n = random.nextInt(max - min) + min + 1;
			num.add(n);
		}
		
		return null;
	}

}
