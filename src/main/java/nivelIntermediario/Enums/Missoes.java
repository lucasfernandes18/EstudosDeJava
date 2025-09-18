package nivelIntermediario.Enums;

public class Missoes {
    private String nome;
    private RankDeMissoes Rank;

    //Método para mostrar mais informações
    public void exibirDetalhes(){
        System.out.println("Missao: " + nome + " Rank: " + getRank() + "(descrição: " + getRank().getDescricao() + ", "+ " dificuldade: " + getRank().getDificuldade() + ")" );
    }



    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        Rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return Rank;
    }

    public void setRank(RankDeMissoes rank) {
        Rank = rank;
    }
}
