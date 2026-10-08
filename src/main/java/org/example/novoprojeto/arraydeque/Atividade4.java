package org.example.novoprojeto.arraydeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Atividade4 {
    static void main() {

        //4. Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        Queue<String> fila = new ArrayDeque<>(List.of("Ana", "Maria", "Julia"));

        while (!fila.isEmpty()) {
            System.out.println("\nFila: " + fila);
            System.out.println("Próximo da fila: " + fila.poll());
        }

        System.out.println("\nFila Vazia!");





    }
}
