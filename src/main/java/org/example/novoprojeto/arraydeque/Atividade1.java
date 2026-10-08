package org.example.novoprojeto.arraydeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Atividade1 {
    static void main() {

        // 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.

        Queue<String> fila = new ArrayDeque<>();

        fila.add("Ana");
        fila.add("Maria");
        fila.add("Julia");

        System.out.println("Pessoas na fila: " + fila);
        System.out.println("Qtd.: " + fila.size());

    }
}
