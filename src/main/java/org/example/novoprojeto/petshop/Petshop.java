package org.example.novoprojeto.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Petshop {

    static void main() {

        Scanner sc = new Scanner(System.in);

        Pet meuPet = new Pet();
        ArrayList<Pet> pets = new ArrayList<>();

        int opcao = -1;

        while (opcao!=0) {
            System.out.println("== PET SHOP ==");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Listar Pets");
            System.out.println("3 - Buscar Pet");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nCadatrar Pet:");

                    System.out.print("Qual o nome do seu pet? ");
                    meuPet.nome = sc.nextLine();

                    System.out.print("Qual a sua espécie? ");
                    meuPet.especie = sc.nextLine();

                    System.out.print("Qual o seu peso? ");
                    meuPet.peso = sc.nextDouble();

                    meuPet.porte = meuPet.definirPorte();

                    pets.add(meuPet);

                    System.out.println("Pet cadastrado!");
                    System.out.printf("Agora são %d pet(s).\n\n", pets.size());
                    break;

                case 2:
                    System.out.println("== PETS CADASTRADOS ==");
                    if (pets.isEmpty()){
                        System.out.println("Nenhum pet cadastrado.\n");
                    } else {
                        for (Pet pet : pets) {
                            System.out.println(pet.nome + " (" + pet.especie + ") - "
                                    + pet.peso + " kg - Porte " + pet.porte);
                        }
                    }
                    break;

                case 3:

                    break;

                case 0:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
