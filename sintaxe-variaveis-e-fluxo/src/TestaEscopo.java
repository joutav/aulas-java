
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas > 1) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Voce tem mais de 18 anos");
		} else {
			System.out.println("Voce nao tem mais de 18 anos");

		}
	}

}
