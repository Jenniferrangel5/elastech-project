package org.example.novoprojeto.foreach;

public class Exercício3 {
    static void main() {
        //3. Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.

        double[] notas = {8, 6, 10, 7};
        double soma = 0;

        for (double nota : notas){
            soma += nota;

        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma/notas.length));

    }
}
