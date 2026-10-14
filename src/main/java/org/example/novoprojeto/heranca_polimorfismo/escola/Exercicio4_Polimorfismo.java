package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Exercicio4_Polimorfismo {
    static void main() {

        Estagiaria maria = new Estagiaria();

        maria.idade = 19;
        maria.nome = "Maria";

        Pessoa pessoa = maria;

        pessoa.apresentar();

    }

}
