package org.example.novoprojeto.projetopetshop;

import java.util.Scanner;

public class Petshop {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Pet ficha = new Pet();

        System.out.println("== FICHA DO PET ==");
        System.out.print("Qual o nome do seu pet? ");
        ficha.nome = sc.nextLine();

        System.out.print("Qual a sua espécie? ");
        ficha.especie = sc.nextLine();

        System.out.print("Qual o seu peso? ");
        ficha.peso = sc.nextDouble();

        if (ficha.peso<10){
            ficha.porte = "Pequeno";
        } else if (ficha.peso>=10 && ficha.peso <25){
            ficha.porte = "Médio";
        } else {
            ficha.porte = "Grande";
        }

        System.out.println("== FICHA DO PET ==");
        System.out.println("Nome: " + ficha.nome);
        System.out.println("Espécie: " + ficha.especie);
        System.out.printf("Peso: %.1f kg\n", ficha.peso);
        System.out.println("Porte: " + ficha.porte);

    }
}
