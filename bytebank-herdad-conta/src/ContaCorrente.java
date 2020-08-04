
public class ContaCorrente extends Conta {
	
	
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
	
	
	
}
