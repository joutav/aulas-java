package br.com.jaum.tabela.testes;

import br.com.jaum.tabela.funcoes.Partida;
import br.com.jaum.tabela.modelos.Time;

public class TestaEmbates {

	public static void main(String[] args) {
		
		Time pain = new Time("Pain Gaming");
		Time intz = new Time("INTZ");
		
		Partida partida = new Partida();
		partida.Embate(pain, intz, 26);
		
		System.out.println(pain.score());
		System.out.println(intz.score());

		
		
		
	}

}
