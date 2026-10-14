package org.example.novoprojeto.interfaces.notificacao;

public class Email implements Notificacao {

    /*4.Crie duas classes que implementam ela: Email e SMS. Cada uma imprime de um jeito.
    Saída esperada:
    E-mail enviado: Sua compra foi aprovada! */

    @Override
    public void enviar(String mensagem){
        System.out.println("E-mail enviado: " + mensagem);
    }

}
