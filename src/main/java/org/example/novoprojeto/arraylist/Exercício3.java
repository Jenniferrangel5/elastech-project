package org.example.novoprojeto.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercício3 {
    static void main() {

        // - Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Maria", "Julia", "Marta"));

        System.out.println(nomes);

        nomes.set(2, "Tiana");
        System.out.println(nomes);

    }
}
