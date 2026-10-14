package org.example.novoprojeto.foreach;

public class Exercício4 {
    static void main(){
        /*4. Com um array de nomes, use for-each e um if para contar quantos têm mais de 5 letras. Mostre o total.
        Dica: usem o método length. */

        String[] nomes = {"Ana", "Maria", "Julia", "Mariane", "Catia Flavia", "Ju"};
        int cont=0;

        for (String nome : nomes){
            if (nome.length()>5){
                cont ++;
            }
        }

        System.out.println("Nomes com mais de 5 letras: " + cont);

    }
}
