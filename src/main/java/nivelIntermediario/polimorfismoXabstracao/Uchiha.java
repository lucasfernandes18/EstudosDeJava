package nivelIntermediario.polimorfismoXabstracao;

public class Uchiha extends Ninja{
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("poder da agua");
    }


}
