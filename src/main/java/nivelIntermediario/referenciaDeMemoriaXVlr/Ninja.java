package nivelIntermediario.referenciaDeMemoriaXVlr;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " eu sou da " + aldeia + " e tenho:  ";
    }
}
