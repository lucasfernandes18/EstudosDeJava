package nivelIntermediario.polimorfismoXabstracao;

public abstract class Ninja implements EstratégiaDeBatalha {
    String nome;
    int idade;
    String aldeia;

    public Ninja() {

    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //método abstrato - Obrigatório em todas as classes
    public abstract void habilidadeEspecial();


    //estou sobreescrevendo algo que estou pegando na inteface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estrategia de batalha...");
    }

}
