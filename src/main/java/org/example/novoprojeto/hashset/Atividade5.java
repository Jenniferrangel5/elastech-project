package org.example.novoprojeto.hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade5 {
    static void main() {

        //5. Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.

        HashSet<String> frutas = new HashSet<>(List.of("Amora", "Banana", "Uva"));

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }
}
