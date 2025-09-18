package nivelIntermediario.OverloadXsobrecargas;

public class Uzumaki extends Ninja {
    public void habilidadeEspecial(){
        System.out.println("ativando a habilidadeEspecial");

    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank){
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }
}
