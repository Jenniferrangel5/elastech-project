package org.example.novoprojeto.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Atividade4 {
    static void main() {

        /*4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        Use getOrDefault para mostrar a quantidade de um produto que existe e de um que não existe (devolvendo 0).
        Depois tente com get normal no que não existe e compare. */

        HashMap<String, Integer> estoque = new HashMap<>(Map.of("Biscoito", 5, "Refrigerante", 7));

        System.out.println(estoque.getOrDefault("Suco",0));
        System.out.println(estoque.get("Suco"));

    }
}
