package br.com.jaum.tabela.funcoes;

import br.com.jaum.tabela.modelos.Time;

public class Partida {
	
	private void confrontoDireto(Time vencedor, Time perdedor) {
	
	}
	
	public void Embate(Time vencedor, Time perdedor,float tempoGame) {
		vencedor.ganhou(tempoGame);
		perdedor.perdeu();
		confrontoDireto(vencedor, perdedor);
	
	
	
	}
	
	

}


	