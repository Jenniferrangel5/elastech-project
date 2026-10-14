package org.example.novoprojeto.heranca_polimorfismo.escola;

public class Professora extends Aluna {

/*    @Override
    public void apresentar(){
        System.out.printf("Oi, sou %s e ensino %s.\n",nome, curso);
    }*/

    String disciplina;

    public void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s.", nome, nota, aluna);
    }
    //@Override
    void apresentar(String cargo) {
        System.out.println("\nOi, sou " + nome + ", " + cargo);
    }

}
