package org.example.novoprojeto.atividadebuilder;

public class Main {
    static void main() {

        Agendamento thor = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("alérgico a shampoo")
                .desconto(10)
                .build();

        Agendamento luna = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        Agendamento mel = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();

    }
}
