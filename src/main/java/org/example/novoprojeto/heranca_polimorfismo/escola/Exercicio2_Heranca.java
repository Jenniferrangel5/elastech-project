package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Exercicio2_Heranca {
    static void main() {
        //Preencha os três atributos no objeto e chame os dois métodos.

        Aluna aluna = new Aluna();

        aluna.nome = "Julia";
        aluna.idade = 23;
        aluna.curso = "Java";

        aluna.apresentar();
        aluna.estudar();


    }
}
