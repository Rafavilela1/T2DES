package br.com.senai.rafaelvilela.model;

public class Quantidade {
	public static Quantidade[] QUANTIDADE;
	private Integer id;
	private Integer num;
	
	static {
		QUANTIDADE = new Quantidade [5];
		QUANTIDADE[0] = new Quantidade(1,1);
		QUANTIDADE[1] = new Quantidade(2,2);
		QUANTIDADE[2] = new Quantidade(3,3);
		QUANTIDADE[3] = new Quantidade(4,4);
		QUANTIDADE[4] = new Quantidade(5,5);
		
	}

	public Quantidade(Integer id, Integer num) {
		this.id = id;
		this.num = num;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	

}
