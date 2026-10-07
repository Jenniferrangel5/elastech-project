package org.example.novoprojeto.arraydeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Atividade2 {
    static void main() {

        //   2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.

        Queue<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Ana", "Maria", "Julia"));

        System.out.println("Fila: " + fila);

        System.out.println("Próximo da fila: " + fila.peek());

        System.out.println("Fila: " + fila);

    }
}
