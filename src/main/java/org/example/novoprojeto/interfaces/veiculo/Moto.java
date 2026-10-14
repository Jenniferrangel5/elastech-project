package org.example.novoprojeto.interfaces.veiculo;

public class Moto implements Veiculo{

    @Override
    public void ligar(){
        System.out.println("Moto ligou");
    }

    @Override
    public void acelerar(){
        System.out.println("Moto acelerou");
    }

}
