package org.example.novoprojeto.excecoes;

import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        /*1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
        Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero. */

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o número para divisão: ");
        n2 = sc.nextInt();

        try {
            System.out.println("A divisão é: " + n1/n2);
        } catch (ArithmeticException ae) {
            System.out.println("Não pode dividir por zero!");
        } finally {
            sc.close();
            System.out.println("Programa fechado.");
        }

    }
}
