
public class ContaCorrente extends Conta implements Tributavel {
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = 0.20 + valor;
		return super.saca(valorASacar);
	}




	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}




	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
	
	
}
