
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.7;
		System.out.println("Meu salário é " + salario);
		
		double idade = 20;
		System.out.println(idade / 3);
		
		double divisao =3.14/2;
		System.out.println(divisao);
		
		
		//primeira é feita a divisao com inteiros e entao associada a variavel, logo a divisao é forçada a ser inteira.
		double outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		//divisao certa, caso um seja double o outro é transformado
		double maisUmaDivisao = 5.0 / 2;
		System.out.println(maisUmaDivisao);
		
		
	}
}
