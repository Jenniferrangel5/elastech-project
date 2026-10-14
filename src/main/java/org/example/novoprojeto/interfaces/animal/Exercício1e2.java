package org.example.novoprojeto.interfaces.animal;

public class Exercício1e2 {
    static void main() {

        //1.Na Main, crie um cachorro e chame o método.

        Animal snupa = new Cachorro();
        snupa.emitirSom();

        /* Na main, declare as duas variáveis como Animal:
        Animal bidu = new Cachorro();
        Animal salem= new Gato();
        Chame emitirSom() nas duas. */

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

    }
}
