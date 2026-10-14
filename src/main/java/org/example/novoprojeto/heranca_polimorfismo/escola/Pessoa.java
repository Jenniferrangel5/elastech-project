package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Pessoa {
    /*Crie a classe Pessoa com os atributos nome e idade, e o método
   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."*/

    String nome;
    int idade;

    void apresentar(){
        System.out.printf("Oi, sou %s e tenho %d anos.\n", nome, idade);
    }

}


