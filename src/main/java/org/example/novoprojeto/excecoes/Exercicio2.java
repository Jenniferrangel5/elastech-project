package org.example.novoprojeto.excecoes;

import java.util.Scanner;

public class Exercicio2 {
    static void main() {

        /*2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
        Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4. */

        Scanner sc = new Scanner(System.in);

        double[] notas = {5.0, 3.5, 4.3, 2.8, 5.5};
        int posicao;

        System.out.print("Digite uma posição: ");
        posicao = sc.nextInt();

        try {
            System.out.println(notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Array de 0 a 4");
        } finally {
            sc.close();
            System.out.println("Programa fechado.");
        }

    }
}
