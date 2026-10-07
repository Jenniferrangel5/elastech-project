package org.example.novoprojeto.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercício1 {
    static void main() {
        //- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        ArrayList<String> nomes = new ArrayList<>();

        nomes.addAll(List.of("Ana", "Maria", "Julia"));
        System.out.println(nomes);

    }
}
