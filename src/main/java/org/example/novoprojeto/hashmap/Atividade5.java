package org.example.novoprojeto.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Atividade5 {
    static void main() {

        //5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho. Remova uma delas e imprima de novo.

        HashMap<String, Double> mapa = new HashMap<>(Map.of("Ana", 5.00, "Maria", 7.50, "Julia", 6.9));

        System.out.println(mapa);
        System.out.println(mapa.size());

        mapa.remove("Maria");
        System.out.println(mapa);
        System.out.println(mapa.size());

    }
}
