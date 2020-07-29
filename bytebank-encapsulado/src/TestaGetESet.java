
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(5654, 55465);
		//conta.numero = 1337;
		System.out.println(conta.getNumero());
		
	
		conta.setTitular(new Cliente());
		conta.getTitular().setNome("Paulo");
		System.out.println(conta.getTitular().getNome());
		
	}

}
