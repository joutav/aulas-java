package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {


        //generics
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 14);
        Conta cc3 = new ContaCorrente(22, 15);
        Conta cc4 = new ContaCorrente(22, 16);

        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println(lista.size());

        Conta ref = lista.get(1);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println(lista.size());


        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));

        }
        //For novo, mais esbelto. Aprende a usar essa merda jão....
        for(Conta c : lista) {
            System.out.println(c);
        }


    }





}
