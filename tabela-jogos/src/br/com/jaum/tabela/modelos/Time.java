package br.com.jaum.tabela.modelos;
/**
 * Modelo de um time
 * @author jvmga
 *
 */
public class Time {
	
	private int vitorias;
	private int pontos;
	private float tempoVitorias;
	private int derrotas;
	private String nome;	
	
	
	
	public  Time(String nome) {
		this.nome = nome;
	}
	
	
	public void ganhou(float tempoVitoria) {
		tempoVitoria += this.tempoVitorias;
		vitorias++;
		pontos++;
	}
	
	public void perdeu() {
		derrotas++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public float getTempoVitorias() {
		return tempoVitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	
	public  int getPontos () {
		return pontos;
	}
	
	public String score() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome + ":");
		sb.append(System.getProperty("line.separator"));

		sb.append(pontos);
		if(pontos == 1) sb.append(" ponto");
		 else sb.append(" pontos");
		
		
		sb.append(System.getProperty("line.separator"));

		sb.append(vitorias);
		sb.append(" vitorias");
		sb.append(System.getProperty("line.separator"));


		sb.append(derrotas);
		sb.append(" derrotas");
		sb.append(System.getProperty("line.separator"));
		String score = sb.toString();

		
		return score;
	}
	
	
	
}
