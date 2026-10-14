package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Exercicio1_Heranca {
    static void main() {
        //Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

        Aluna aluna = new Aluna();

        aluna.nome = "Ana";
        aluna.idade = 15;

        aluna.apresentar();

    }
}
