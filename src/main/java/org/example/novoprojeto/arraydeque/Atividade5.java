package org.example.novoprojeto.arraydeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Atividade5 {
    static void main() {

        //5. Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.

        Queue<String> fila = new ArrayDeque<>(List.of("Ana", "Bia", "Julia"));

        System.out.println("Bia está na fila? " + fila.contains("Bia"));
        System.out.println("Zoe está na fila? " + fila.contains("Zoe"));

    }
}
