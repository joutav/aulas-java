package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		
		
		Conta referencias[] = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		referencias[0] = cc1;
		System.out.println(cc1);
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 12);
		referencias[1] = cc2;
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		
		System.out.println(ref);

	
	}

}
