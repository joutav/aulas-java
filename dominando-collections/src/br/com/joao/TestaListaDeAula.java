package br.com.joao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando Arraylists", 21);
        Aula a2 = new Aula("Lista de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas.toString());

        Collections.sort(aulas);

        System.out.println(aulas.toString());

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas.toString());




    }
}
