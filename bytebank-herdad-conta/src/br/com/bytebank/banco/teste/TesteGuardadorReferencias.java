package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {


        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(11, 12);
        Conta cp = new ContaPoupanca(11, 13);

        guardador.add(cc);
        guardador.add(cp);

        System.out.println(guardador.getQuantidadeDeElementos());

        Conta ref = (Conta) guardador.getRefencia(1);
        System.out.println(ref.getNumero());


    }
}
