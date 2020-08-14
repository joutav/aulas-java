package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		//sobrecarga
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		
		ContaCorrente cc = new ContaCorrente(123, 321);
		ContaPoupanca cp = new ContaPoupanca(124, 322);
		
		System.out.println(cc);

		System.out.println(cp);
		
		
	}
	

}
