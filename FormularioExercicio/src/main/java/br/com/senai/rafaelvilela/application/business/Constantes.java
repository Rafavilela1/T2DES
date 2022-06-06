package br.com.senai.rafaelvilela.application.business;

import java.util.ArrayList;
import java.util.List;


import br.com.senai.rafaelvilela.application.model.Estado;
import br.com.senai.rafaelvilela.application.model.Interesse;

public class Constantes {

	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSES;
	//atribui objetos a uma lista
	static {
		ESTADOS= new ArrayList<>();
		ESTADOS.add(new Estado("Acre","AC"));
		ESTADOS.add(new Estado("Alagoas","AL"));
		ESTADOS.add(new Estado("Amazonas","AM"));
		ESTADOS.add(new Estado("Manaus","AP"));
		ESTADOS.add(new Estado("Bahia","BA"));
		ESTADOS.add(new Estado("Cear�","CE"));
		ESTADOS.add(new Estado("Distrito Federal","DF"));
		ESTADOS.add(new Estado("Espirito Santo","ES"));
		ESTADOS.add(new Estado("Goiania","GO"));
		ESTADOS.add(new Estado("Maranh�o","MA"));
		ESTADOS.add(new Estado("Minas Gerais","MG"));
		ESTADOS.add(new Estado("Mato Grosso do Sul","MS"));
		ESTADOS.add(new Estado("Mato Grosso do Sul","MT"));
		ESTADOS.add(new Estado("Para�ba","PA"));
		ESTADOS.add(new Estado("S�o Paulo","SP"));

		INTERESSES= new ArrayList<>();
		INTERESSES.add(new Interesse(1,"Esportes"));
		INTERESSES.add(new Interesse(2,"M�sica"));
		INTERESSES.add(new Interesse(3,"Artes Marciais"));
		INTERESSES.add(new Interesse(4,"Viagens"));
		INTERESSES.add(new Interesse(5,"Cinema"));
		INTERESSES.add(new Interesse(6,"Dan�a"));

	}
}
