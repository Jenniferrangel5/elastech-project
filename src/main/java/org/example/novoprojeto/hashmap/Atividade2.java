package org.example.novoprojeto.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Atividade2 {
    static void main() {

        /*2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00, imprima, e depois faça put de "café" DE NOVO com valor 7.50.
        Imprima outra vez e veja o que aconteceu com o tamanho. */

        HashMap<String, Double> produtos = new HashMap<>(Map.of("Café", 5.00));

        System.out.println(produtos);
        System.out.println(produtos.size());

        produtos.put("Café", 7.50);

        System.out.println(produtos);
        System.out.println(produtos.size());

    }
}
