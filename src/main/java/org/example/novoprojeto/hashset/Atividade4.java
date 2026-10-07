package org.example.novoprojeto.hashset;

import java.util.HashSet;
import java.util.List;

public class Atividade4 {
    static void main() {

        //4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.

        HashSet <String> cpf = new HashSet<>(List.of("111.000.222-55", "123.456.789-00", "456.789.123-99"));

        System.out.println("CPFs: " + cpf);

        cpf.remove("123.456.789-00");

        System.out.println("CPFs: " + cpf);
        System.out.println("Qtd.: " + cpf.size());



    }
}
