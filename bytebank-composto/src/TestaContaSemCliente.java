
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(6000.52);
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
				
	}

}
