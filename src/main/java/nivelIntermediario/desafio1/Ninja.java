package nivelIntermediario.desafio1;

public class Ninja {
    String nome;
    int idade;
    String missao;
    char nivelDeDificuldade;
    String statusDaMissao;
    String habilidadeEspecial;

    public void mostrarInformacoes(){
        System.out.println("Nome: "+ nome + "\n"
        + "Idade: "+ idade + "\n"
        + "Missao: "+ missao + "\n"
        + "StatusDaMissao: "+ statusDaMissao + "\n"
        + "o nível de dificuldade é: " + nivelDeDificuldade);
    }

}
