package org.example.novoprojeto.foreach;

public class Exercício5 {
    static void main() {
        //5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal, usando o índice. Deixe os dois na mesma classe e compare.

        String[] nomes = {"Ana", "Maria", "Julia", "Tania"};

        for (String nome : nomes){
            System.out.println(nome);
        }

        for (int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
