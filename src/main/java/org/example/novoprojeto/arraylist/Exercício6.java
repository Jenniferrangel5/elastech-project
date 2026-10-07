package org.example.novoprojeto.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercício6 {
    static void main() {

        //- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Maria", "Julia", "Marta", "Tiana"));

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.println("O nome está na lista? " + nomes.contains(nome));

        if (nomes.contains(nome)==true) {
            System.out.print("Posição: " + nomes.indexOf(nome));
        }

    }
}
