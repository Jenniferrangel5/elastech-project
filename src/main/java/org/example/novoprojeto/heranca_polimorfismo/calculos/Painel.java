package org.example.novoprojeto.heranca_polimorfismo.calculos;

public class Painel {
    /*Crie a classe Painel com QUATRO métodos chamados exibir, cada um
    recebendo um tipo diferente: String, int, boolean e double.
    Cada um imprime de um jeito, dizendo que tipo recebeu. */

    static void exibir(String texto){
        System.out.println("String: " + texto);
    }

    static void exibir(int numero){
        System.out.println("Int: " + numero);
    }

    static void exibir(boolean valor){
        System.out.println("Boolean: " + valor);
    }

    static void exibir(double valor){
        System.out.println("Double: " + valor);
    }

}
