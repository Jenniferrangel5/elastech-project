package org.example.novoprojeto.atividadebuilder;

import lombok.Builder;

@Builder
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    void mostrar(){
        System.out.printf("%s, %s, %s, %b perfume, %b laço, %b hidratação, %s, %.1f %% de desconto.\n",
                nomePet, servico, horario, perfume, laco, hidratacao, observacao, desconto);
    }

}