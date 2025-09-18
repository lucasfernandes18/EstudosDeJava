package nivelIntermediario.construtores;

public class Hocages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;

    public Hocages() {
        //construtor sem argumento e vazio
    }

    public Hocages(String nome) {
         this.nome = nome;
    }

    public Hocages(int idade) {
        this.idade = idade;
    }

    //all args constructor = o construtor recebendo todos os argumentos.
    public Hocages(String nome,int idade, boolean vivoOuNao) {
this.nome = nome;
this.idade = idade;
this.vivoOuNao = vivoOuNao;
//a variável recebe o argumento
    }

}
