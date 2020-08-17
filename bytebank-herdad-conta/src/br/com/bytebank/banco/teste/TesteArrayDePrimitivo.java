package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivo {

	public static void main(String[] args) {
		
		int[] idades =  new int[5]; //inicializa o array com 0
		
		for(int i = 0; i <idades.length; i++) {
			idades[i] = i*i;
		}

		for (int idade : idades) {
			System.out.println(idade);


		}


	}


}
