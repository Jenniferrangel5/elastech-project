package org.example.novoprojeto.encapsulamento;

public class Exercicio1e2 {
    public static void main() {

        ContaBancaria c = new ContaBancaria();

        /*System.out.println(c.titular);
        c.saldo = -5000; */

        System.out.println(c.getTitular());
        System.out.println(c.getSaldo());

    }
}
