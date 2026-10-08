package org.example.novoprojeto.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade3 {
    static void main() {

        /*3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey dentro de um if para mostrar o telefone
        de alguém que está na agenda e de alguém que não está. */

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> agenda = new HashMap<>(Map.of("Ana", "12345-6789", "Julia", "78945-6123"));

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        if (agenda.containsKey(nome)) {
            System.out.println("Contato " + nome + ": " + agenda.get(nome));
        } else {
            System.out.println(nome + " não está na agenda!");
        }

    }
}
