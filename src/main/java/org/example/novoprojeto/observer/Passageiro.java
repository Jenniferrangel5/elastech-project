package org.example.novoprojeto.observer;

public class Passageiro implements ObservadorVoo {

    @Override
    public void atualizar (String status){
        System.out.println("Passageiro avisa: " + status);
    }
}