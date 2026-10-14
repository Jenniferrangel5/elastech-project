package org.example.novoprojeto.heranca_polimorfismo.empresa;

public class Exercicio5_Heranca {
    static void main() {
        /* 5.Na Main, crie uma Diretora, preencha o nome dela
        (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
        6. Na Main, crie um gerente, preencha o nome e chame os quatro métodos nele:
        baterPonto(), aprovarFerias(), notificar() e exportar().*/

        Diretora carla = new Diretora();
        Gerente ana = new Gerente();

        carla.nome = "Carla";
        ana.nome = "Ana";

        carla.baterPonto();
        carla.definirMeta("50");
        carla.aprovarFerias("Maria");

        ana.baterPonto();
        ana.aprovarFerias("Carla");
        ana.notificar("Você foi notificado");
        ana.exportar();



    }
}
