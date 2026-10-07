package org.example.novoprojeto.hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade1 {
    static void main() {

        //1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido.
        //   Imprima o conjunto e o tamanho. Repare no que aconteceu com o repetido.

        HashSet<String> nomes = new HashSet<>(List.of("Ana", "Maria", "Ana", "Rute"));

        System.out.println(nomes);
        System.out.println(nomes.size());

    }
}
