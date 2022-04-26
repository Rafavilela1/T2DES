package br.com.senai.rafaelvilela.model;

public class Linguagem {
	public static Linguagem[] LINGUAGENS;
	private Integer id;
	private String nome;
	
	static {
		LINGUAGENS = new Linguagem [5];
		LINGUAGENS[0] = new Linguagem(1,"Java");
		LINGUAGENS[1] = new Linguagem(2,"IOS");
		LINGUAGENS[2] = new Linguagem(3,"C++");
		LINGUAGENS[3] = new Linguagem(4,"C#");
		LINGUAGENS[4] = new Linguagem(5,"PHP");
		
	}

	public Linguagem(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	
}
