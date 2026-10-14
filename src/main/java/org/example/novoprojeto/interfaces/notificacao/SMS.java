package org.example.novoprojeto.interfaces.notificacao;

public class SMS implements Notificacao{

    /*4.Crie duas classes que implementam ela: Email e SMS. Cada uma imprime de um jeito.
    Saída esperada:
    SMS enviado: Sua compra foi aprovada! */

    @Override
    public void enviar(String mensagem){
        System.out.println("SMS enviado: " + mensagem);
    }

}
