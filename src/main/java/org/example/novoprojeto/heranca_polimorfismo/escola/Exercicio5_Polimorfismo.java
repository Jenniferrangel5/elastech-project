package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Exercicio5_Polimorfismo {
    static void main() {

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 15;

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java + IA";

        Estagiaria maria = new Estagiaria();
        maria.idade = 19;
        maria.nome = "Maria";

        mostrarFicha(maria);
        mostrarFicha(ana);
        mostrarFicha(flora);

    }

    static void mostrarFicha(Pessoa p){
        p.apresentar();
    }

}
