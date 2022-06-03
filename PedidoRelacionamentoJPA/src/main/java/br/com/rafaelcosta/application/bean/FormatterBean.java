package br.com.rafaelcosta.application.bean;


import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
//coloca o valor de acordo com a moeda local(real);transforma o valor em double
public class FormatterBean implements Serializable {


	private static final Locale LOCALE_BR = new Locale("pt", "BR");
	
	public String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BR);
		//escolhe qual valor vai ser formatado
		return nf.format(valor);
	}
}
