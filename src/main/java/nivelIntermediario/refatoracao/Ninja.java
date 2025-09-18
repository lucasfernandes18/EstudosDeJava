package nivelIntermediario.refatoracao;

public abstract class Ninja implements EstratégiaDeBatalha {
    //TODO:Incluir dois novos atrubutos: missoes concluidas, Rank
    //TODO: Rank: gennin chunnin, jounnin, hokage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
   final double altura = 1.89;


public Ninja(){}
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //todo ninja vai fazer obrigatóriamente
    //nenhum método final pode ser sobreescrito
    final void tacarKunai(){
        System.out.println("esse é um método da classe mãe");
    }



    // todo: Sobrecarga do construtor chamando os novos atributos
    //sobrecarga de metodos voce não precisa redeclarar o contrutor, só os novos atributos

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //método abstrato - Obrigatório em todas as classes
    public abstract void habilidadeEspecial();

    //estou sobreescrevendo algo que estou pegando na inteface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estrategia de batalha...");
    }


    //sobrecarga de método- padrão

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("meu nome é " + nome + " e essa é mimnha inteligencia de combate");
    }


    // sobrecarga de metodo
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu qi é " + qi +" e você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu qi é: " + qi + " e voce é um ninja promissor");
        }else {
            System.out.println("seu qi é: " + qi + "e voce precisa treinar mais suas habilidades");
        }
    }

}
