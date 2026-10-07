package org.example.novoprojeto.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Atividade1 {
    static void main() {

        //1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> mapa = new HashMap<>(Map.of("Ana", 15, "Julia", 17, "Maria", 10));

        System.out.println(mapa);
        System.out.println("Idade da Julia: " + mapa.get("Julia"));

    }
}
