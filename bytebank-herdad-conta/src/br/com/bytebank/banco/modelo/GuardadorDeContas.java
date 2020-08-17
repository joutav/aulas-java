package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    int posicaoLivre;

    public GuardadorDeContas(){
        this.referencias = new Conta[10];
    }


    public void add(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getRefencia(int i) {
        return this.referencias[i];
    }
}
