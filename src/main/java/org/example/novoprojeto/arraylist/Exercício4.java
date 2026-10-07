package org.example.novoprojeto.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercício4 {
    static void main() {

        //- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String> cidades = new ArrayList<>(Arrays.asList("Rio de Janeiro", "Salvador", "Curitiba", "São Paulo"));

        cidades.remove(1);
        System.out.println(cidades);

    }
}
