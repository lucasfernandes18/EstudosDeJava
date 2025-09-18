package nivelIntermediario.classesAbstratasXinterfaces;

public interface NinjaInterface {

    //todos os métodos já são por padrão abstratos
    //precisam ser instanciados pela classe que a implementou

    public void tacarUmaShuriken();

    /*todos os valores já são "FINAL" por padrão, os valores atribuídos na interface serão pra sempre esses.
    * Obrigatoriamente as variáveis precisam receber um valor já na interface*/
    String nome = "sasuke Uchiha";
    int idade = 18;
    String aldeia = "tribo da folha";
}
