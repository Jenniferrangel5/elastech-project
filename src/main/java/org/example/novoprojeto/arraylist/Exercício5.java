package org.example.novoprojeto.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercício5 {
    static void main() {

        /* - Crie uma lista com seis nomes e imprima todos usando um laço,
        no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista) */

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Maria", "Julia", "Marta", "Tiana", "Mariana"));

        for (int i=0; i<nomes.size(); i++) {
            System.out.println(i + " : " + nomes.get(i));
        }

    }
}
