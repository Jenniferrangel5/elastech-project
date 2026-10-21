package org.example.novoprojeto.atividadeconstrutor;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento (String nomePet, String servico, String horario, boolean perfume, boolean laco,
                        boolean hidratacao, String observacao, double desconto){
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    void mostrar(){
        System.out.printf("%s, %s, %s, %b perfume, %b laço, %b hidratação, %s, %.1f %% de desconto.\n",
                nomePet, servico, horario, perfume, laco, hidratacao, observacao, desconto);
    }

}