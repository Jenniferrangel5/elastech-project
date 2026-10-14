package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Aluna extends Pessoa{
    //1.Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.

    /*2. Acrescente na Aluna o atributo curso e o método estudar(), que
   imprime "[nome] está estudando [curso]."*/

    String curso;

    void estudar() {
        System.out.printf("%s está estudando %s.\n", nome, curso);
    }

}
