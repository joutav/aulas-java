package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {


        //generics
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 14);
        Conta cc3 = new ContaCorrente(22, 14);


        lista.add(cc);
        lista.add(cc2);

        //o metodo contains foi sobescrito, logo utiliza o metodo da classe conta.
        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? " + existe);



        for(Conta c : lista) {
            System.out.println(c);
        }

        for(Conta c : lista){
            if(c.equals(cc3)){
                System.out.println("Já tenho essa conta");
            }
        }






    }





}
