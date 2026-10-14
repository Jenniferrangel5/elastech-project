package org.example.novoprojeto.heranca_polimorfismo.empresa;

public class Gerente extends Funcionario
        implements Notificavel, Exportavel {
    //5. Faça uma cadeia de três níveis: - Gerente extends Funcionario, com aprovarFerias(String quem)
    //6.Faça o Gerente do exercício 5 implementar as duas, SEM tirar o extends Funcionario:

    void aprovarFerias(String quem){
        System.out.println("Aprovou as férias de " + quem);
    };

    @Override
    public void notificar(String mensagem){
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Exportado");
    }

}
