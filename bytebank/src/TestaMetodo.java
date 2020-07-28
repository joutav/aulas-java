
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);

		conta.saca(20);
		System.out.println(conta.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(5000, conta)) {
			System.out.println("Transferencia feita com sucesso");

		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaMarcela.saldo);
		System.out.println(conta.saldo);
		
	}

}
