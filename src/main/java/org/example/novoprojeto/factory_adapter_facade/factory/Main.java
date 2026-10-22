package org.example.novoprojeto.factory_adapter_facade.factory;

public class Main {
    static void main() {

        Animal cachorro = AnimalFactory.getAnimal("cachorro");
        Animal gato = AnimalFactory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

    }
}
