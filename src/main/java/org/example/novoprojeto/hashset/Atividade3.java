package org.example.novoprojeto.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Atividade3 {
    static void main() {

        //3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.

        ArrayList <String> nomes = new ArrayList<>(List.of("Ana", "Maria", "Ana", "Rute", "Ana", "Maria", "Ana", "Rute"));

        System.out.println("Todos os nomes: " + nomes);

        HashSet<String> nomesSemRepeticao = new HashSet<>(nomes);

        System.out.println("Sem repetição: " + nomesSemRepeticao);

    }
}
