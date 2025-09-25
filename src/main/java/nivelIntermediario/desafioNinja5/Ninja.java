package nivelIntermediario.desafioNinja5;

public record Ninja(int Id, String nome, int idade, String aldeia) {
    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                '}';
    }
}
