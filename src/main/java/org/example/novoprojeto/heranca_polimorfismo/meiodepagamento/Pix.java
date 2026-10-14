package org.example.novoprojeto.heranca_polimorfismo.meiodepagamento;

public class Pix implements MeioDePagamento{
    @Override
    public void pagar (double valor){
        System.out.printf("Pix: R$%.2f\n", valor);
    }
}
