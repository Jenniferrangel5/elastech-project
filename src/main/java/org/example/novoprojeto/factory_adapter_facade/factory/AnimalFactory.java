package org.example.novoprojeto.factory_adapter_facade.factory;

public class AnimalFactory {
    public static Animal getAnimal(String tipo) {
        if (tipo == "cachorro"){
            return new Cachorro();
        } else if (tipo == "gato"){
            return new Gato();
        } throw new IllegalArgumentException("Tipo inválido!");
    }
}
