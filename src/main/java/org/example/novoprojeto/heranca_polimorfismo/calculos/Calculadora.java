package org.example.novoprojeto.heranca_polimorfismo.calculos;

public class Calculadora {
    //1.Crie a classe Calculadora com TRÊS métodos chamados calcularArea():

    //- recebe um double (lado do quadrado)  -> lado * lado
    static double calcularArea(double lado){
        return lado*lado;
    }

    // - recebe dois double (base e altura)   -> base * altura
    static double calcularArea(double base, double altura){
        return base * altura;
    }

    // - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
    static double calcularArea(int raio){
        return 3.14159 * (raio * raio);
    }



}
