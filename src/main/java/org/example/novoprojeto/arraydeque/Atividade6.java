package org.example.novoprojeto.arraydeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Atividade6 {
    static void main() {

        /*6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        - se estiver vazia  -> "Não tem ninguém na fila."
        - se tiver gente    -> "Próximo: [nome]"
        Depois adicione uma pessoa e teste de novo. */

        Queue<String> fila = new ArrayDeque<>();

        //fila.add("Ana");

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila!");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

    }
}
