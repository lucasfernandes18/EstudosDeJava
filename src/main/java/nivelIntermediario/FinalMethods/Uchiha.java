package nivelIntermediario.FinalMethods;

public class Uchiha extends Ninja {
    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("poder da agua");
    }
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu qi é " + qi +" e você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu qi é: " + qi + " e voce é um ninja promissor");
        }else {
            System.out.println("seu qi é: " + qi + "e voce precisa treinar mais suas habilidades");
        }
    }

    public void inteligenciaDeCombate() {
        System.out.println("meu nome é " + nome + " e essa é mimnha inteligencia de combate");
    }


}
