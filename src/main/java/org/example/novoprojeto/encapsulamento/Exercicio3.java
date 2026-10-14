package org.example.novoprojeto.encapsulamento;

public class Exercicio3 {
    public static void main() {

        ContaBancaria c = new ContaBancaria();

        c.setTitular("");
        System.out.println(c.getTitular());

        c.setTitular("Ana");
        System.out.println(c.getTitular());

    }
}
