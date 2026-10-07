package org.example.novoprojeto.hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade2 {
    static void main() {

        //2. Crie um HashSet de cores usando addAll. Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.

        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Azul", "Verde", "Amarelo", "Rosa"));

        if (cores.contains("Verde")) {
            System.out.println("Contém a cor verde.");
        } else {
            System.out.println("Não contém a cor verde.");
        }

    }
}
