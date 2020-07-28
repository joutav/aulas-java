
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 10;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
		} else if(quantidadePessoas > 1) {
			System.out.println("Voce nao tem mais de 18 anos, "
					+ "mas pode entrar pois está acompanhado");
		} else {
			System.out.println("Voce nao tem mais de 18 anos");

		}
	}

}
