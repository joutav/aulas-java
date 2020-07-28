
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.5;
		int valor  = (int)  salario;
		System.out.println(valor);
		
		//variaveis para numeros grandes
		long numeroGrande = 321123321123l;
		short valorPequeno = 3231;
		byte b = 127;
		
		//fato curioso
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;
	}
}
