package org.example.novoprojeto.observer;

import java.util.ArrayList;

public class Voo {
    private ArrayList<ObservadorVoo> observador = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo observadores){
        this.observador.add(observadores);
    }

    public void mudarStatus(String status){
        for (ObservadorVoo observadores : observador){
            observadores.atualizar(status);
        }

    }
}
