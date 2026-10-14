package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Exercicio3_Polimorfismo {
    static void main() {
        /*Na Main, crie uma aluna e uma professora e dê valor aos atributos
        de cada objeto: */

        Professora flora = new Professora();
        Aluna ana = new Aluna();

        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java + IA";

        ana.nome = "Ana";

        flora.lancarNota(ana.nome, 9.5);

        flora.apresentar("professora");

    }
}
