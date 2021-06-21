package br.com.joao;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleçoes do java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula ", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

        System.out.println(javaColecoes.getAulas());




    }
}
