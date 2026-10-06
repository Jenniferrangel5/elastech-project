package org.example.novoprojeto.excecoes;

import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        /*5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        Trate a ArithmeticException para o caso de ela digitar 0. */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        try {
            System.out.println("A divisão é: " + (100/num));
        } catch (ArithmeticException ae) {
            System.out.println("Não pode dividir por zero!");
        } finally {
            sc.close();
            System.out.println("Programa fechado.");
        }

    }
}
