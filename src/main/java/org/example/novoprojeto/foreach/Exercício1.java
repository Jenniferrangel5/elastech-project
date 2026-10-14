package org.example.novoprojeto.foreach;

public class Exercício1 {
    static void main() {
        //1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each, um por linha.

        String[] nomes = {"Ana", "Maria", "Julia", "Tania"};

        for (String nome : nomes){
            System.out.println(nome);
        }

    }
}
