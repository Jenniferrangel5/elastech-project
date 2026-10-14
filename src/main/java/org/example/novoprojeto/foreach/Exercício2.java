package org.example.novoprojeto.foreach;

import java.util.ArrayList;
import java.util.List;

public class Exercício2 {
    static void main() {
        //2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

        ArrayList<Double> notas = new ArrayList<>(List.of(5.0, 3.7, 4.9, 9.9, 6.5));

        for (double nota : notas){
            System.out.println(nota);
        }

    }
}
