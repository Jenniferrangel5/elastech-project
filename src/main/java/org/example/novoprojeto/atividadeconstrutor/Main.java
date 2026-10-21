package org.example.novoprojeto.atividadeconstrutor;

public class Main {
    static void main() {

        Agendamento thor = new Agendamento("Thor", "banho", "14h", true, true, false,
                "alérgico a shampoo", 10.0);

        Agendamento luna = new Agendamento("Luna", "tosa", "10h", false, false, false,
                " ", 0);

        Agendamento mel = new Agendamento("Mel", "banho", "16h", false, false, true,
                " ", 0);

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();

    }
}
