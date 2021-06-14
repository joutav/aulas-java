package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setCpf("4654565");
        cliente.setNome("Joao");
        cliente.setProfissao("Dev");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();





    }

}
