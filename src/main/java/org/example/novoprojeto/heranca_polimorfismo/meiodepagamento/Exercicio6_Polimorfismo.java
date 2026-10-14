package org.example.novoprojeto.heranca_polimorfismo.meiodepagamento;

public class Exercicio6_Polimorfismo {
    static void main() {

        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);

    }

}
