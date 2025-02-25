package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];

    }

    public void add(Object ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos(){
        return this.posicaoLivre;

    }

    public Object getRefencia(int pos){
        return this.referencias[pos];
    }

}
