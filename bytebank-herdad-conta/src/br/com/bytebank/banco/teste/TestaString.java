package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {
		
		String vazio = " ";
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		
		
		
		String nome = "Alura"; //objct literal
		//case sensitive
		System.out.println(nome.contains("Alu"));
		
		String outra = nome.toLowerCase();
		System.out.println(outra);
		
//		char c = nome.charAt(1);
//		System.out.println(c);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		
		String sub = nome.substring(2);
		System.out.println(sub);

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
	}

}
