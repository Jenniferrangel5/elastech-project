package org.example.novoprojeto.petshop;

public class Tosa implements Servico{
    @Override
    public void executar (String nome){
        System.out.printf("Tosando %s...\n", nome);
    }
}
