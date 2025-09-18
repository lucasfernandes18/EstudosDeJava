package nivelIntermediario.Enums;

public enum RankDeMissoes {
    //cada enum pode ter apenas uma unica funcionalidade

    D("moderada", 7),
    C("baixa", 2),
    B("alta", 10),
    A("moderada", 7),
    S("baixa", 8);


    //ira servir como argumentos para as opções.
    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
