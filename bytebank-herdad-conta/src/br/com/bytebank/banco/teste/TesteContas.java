package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(1111, 123321);
		cc.deposita(100);
		ContaPoupanca cp = new ContaPoupanca(1111, 123321);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		System.out.println("CP " + cp.getSaldo());
		System.out.println("CC " + cc.getSaldo());
	}

}
