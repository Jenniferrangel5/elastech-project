package org.example.novoprojeto.interfaces.veiculo;

import java.util.ArrayList;

public class Exercicio5 {
    public static void main(){
        //Coloque numa lista e percorra com for-each chamando os dois métodos em cada um.

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }

    }

}
