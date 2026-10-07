package org.example.novoprojeto.arraydeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Atividade3 {
    static void main() {

        //3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.

        Queue<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Ana", "Maria", "Julia"));

        System.out.println("Fila: " + fila);

        System.out.println("Próximo da fila: " + fila.poll());

        System.out.println("Fila Atualizada: " + fila);





    }
}
