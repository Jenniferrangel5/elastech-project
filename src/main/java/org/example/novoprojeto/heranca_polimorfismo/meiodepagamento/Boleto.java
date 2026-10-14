package org.example.novoprojeto.heranca_polimorfismo.meiodepagamento;

public class Boleto implements MeioDePagamento{

    @Override
    public void pagar (double valor){
        System.out.printf("Boleto: R$%.2f\n", valor);
    }

}
