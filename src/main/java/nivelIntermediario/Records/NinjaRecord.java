package nivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    //todos os atributos sao final por padrão
    //Records nao tem setter

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
