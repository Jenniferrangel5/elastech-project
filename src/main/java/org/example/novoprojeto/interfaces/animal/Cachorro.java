package org.example.novoprojeto.interfaces.animal;

public class Cachorro implements Animal {
    /*1. Crie uma interface Animal com o método emitirSom().
    Crie a classe Cachorro que implementa ela e imprime "Au au!". */

    @Override
    public void emitirSom() {
        System.out.println("Au au");

    }
}
