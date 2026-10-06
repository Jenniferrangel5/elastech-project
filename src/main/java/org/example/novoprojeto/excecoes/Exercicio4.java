package org.example.novoprojeto.excecoes;

public class Exercicio4 {
    static void main() {

        /*4 — Crie uma variável String nome = null; e tente imprimir nome.length().
        Trate a NullPointerException e mostre "O nome não foi preenchido." */

        String nome = null;

        try {
            System.out.println(nome.length());
        } catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido.");
        }
    }
}
