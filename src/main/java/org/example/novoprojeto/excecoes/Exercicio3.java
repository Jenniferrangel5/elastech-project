package org.example.novoprojeto.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    static void main() {

        /* 3 — Peça a idade da pessoa com scanner.nextInt().
        Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número. */

        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");

        try {
            idade = sc.nextInt();

            System.out.print("Confimando sua idade: " + idade + " anos.");
        } catch (InputMismatchException ime) {
            System.out.println("Digite um número!");
        } finally {
            sc.close();
            System.out.println("Programa fechado.");
        }

    }
}
