package br.com.jaum.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBibioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		c.deposita(300);
		System.out.println(c.getSaldo());
	}

}
