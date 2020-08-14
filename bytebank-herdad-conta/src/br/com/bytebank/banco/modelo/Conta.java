package br.com.bytebank.banco.modelo;


/**
 * Classe que represtenta uma moldura de uma conta.
 * @author jvmga
 *
 */

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    /**
     * Construtor para iniciar uma conta a partir da agência e numero.
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
    	total++;
    	this.agencia = agencia;
    	this.numero = numero;
    }
    
    public abstract void deposita(double valor);
  
    	
    
    /**
     * Valor precisa ser maior que o saldo.
     * @param valor
     */
    public void saca(double valor){
    	
    	boolean saca = true;
    	try {
	    	if(this.saldo < valor) {
	    		throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
	    	}
    	} catch(SaldoInsuficienteException ex) {
    		System.out.println("Ex: " + ex.getMessage());
    		saca = false;
    		
    	}
    	
		if(saca)this.saldo -= valor;

    	
    }

    public void transfere(double valor, Conta destino) {
    	saca(valor); 
    	destino.deposita(valor);
    	
    	
    }
    
    public double getSaldo(){
    	return this.saldo;
    }

    public int getNumero() {
    	return this.numero;
    }

    public void setNumero(int numero) {
    	this.numero = numero;
    }

    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return titular;
	}
    
    public static int getTotal() {
		return total;
	}
    
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
    
    
}