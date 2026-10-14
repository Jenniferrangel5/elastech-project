package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Exercicio4_Heranca {
    static void main() {
        //4.Chame apresentar() na aluna e na professora e compare as saídas.

        Aluna aluna = new Aluna();
        Professora prof = new Professora();

        aluna.idade = 20;
        aluna.nome = "Maria";

        prof.nome = "Rayssa";
        prof.curso = "C++";

        aluna.apresentar();
        prof.apresentar();

    }
}
