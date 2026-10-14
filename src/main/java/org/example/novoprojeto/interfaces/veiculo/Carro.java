package org.example.novoprojeto.interfaces.veiculo;

public class Carro implements Veiculo{

    @Override
    public void ligar(){
        System.out.println("Carro ligou");
    }

    @Override
    public void acelerar(){
        System.out.println("Carro acelerou");
    }
}
