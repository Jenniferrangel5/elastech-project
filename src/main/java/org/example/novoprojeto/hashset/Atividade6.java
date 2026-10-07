package org.example.novoprojeto.hashset;

import java.util.HashSet;

public class Atividade6 {
    static void main() {

        //6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e imprima o isEmpty() de novo.

        HashSet<Integer> num = new HashSet<>();

        System.out.println("A lista está vazia? " + num.isEmpty());

        num.add(5);

        System.out.println("A lista está vazia? " + num.isEmpty());

    }
}
