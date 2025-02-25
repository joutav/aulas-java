package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel {
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	
	
	@Override
	public void saca(double valor) {
		double valorASacar = 0.20 + valor;
		super.saca(valorASacar);
	}




	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}




	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
	
	
}
