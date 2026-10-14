package org.example.novoprojeto.encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular (){
        return titular;
    }

    public double getSaldo (){
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Inválido! Mantido " + this.titular);
        }
        this.titular = titular;
    }

//    PÚBLICOS:
//            - depositar(double valor)   -> recusa valor menor ou igual a zero
//   - sacar(double valor)       -> recusa se não tiver saldo

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido!");
        }
      //  return this.saldo += valor;
    }

    public void sacar (double valor){
        if (valor <= 0){
            System.out.println("Saldo insuficiente!");
        }
      //  return this.saldo -= valor;
    }



}
