package org.example.novoprojeto.interfaces.animal;

public class Gato implements Animal {
    /*2. Agora acrescente a classe Gato, que implementa a mesma interface e imprime "Miau!". */

    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }
}
