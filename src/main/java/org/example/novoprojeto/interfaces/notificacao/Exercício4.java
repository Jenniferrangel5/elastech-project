package org.example.novoprojeto.interfaces.notificacao;

import java.util.ArrayList;

public class Exercício4 {
    static void main() {

        //Adicione as duas num ArrayList<Notificacao> e percorra com for-each, enviando a mesma mensagem.

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao : notificacoes){
            notificacao.enviar("Sua compra foi aprovada!");
        }

    }
}
