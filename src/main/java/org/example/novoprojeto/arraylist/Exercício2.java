package org.example.novoprojeto.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercício2 {
    static void main() {
        // - Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Amora", "Banana", "Uva", "Melão"));

        System.out.println("Primeira posição: " + frutas.get(0));
        System.out.println("Última posição: " + frutas.get(frutas.size()-1));

    }
}
