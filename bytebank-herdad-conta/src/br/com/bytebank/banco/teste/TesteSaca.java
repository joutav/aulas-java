package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(123, 321);
		conta.deposita(300);
		conta.saca(200);
		
		System.out.println(conta.getSaldo());
	}

}
