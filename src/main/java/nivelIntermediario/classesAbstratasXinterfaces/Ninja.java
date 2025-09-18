package nivelIntermediario.classesAbstratasXinterfaces;

public abstract class Ninja {
    /*todas as classes abstratas são protegidas de ser instanciadas,
    * obrigando o dev a usar as subClasses para criar o objeto desejado
    */

    /*serve para organizar o código*/

    String nome;
    int idade;
    String aldeia;


    //métodos abstratos
    /*nao possuem corpo e devem ser instanciadas em todas as subClasses*/
    public abstract void nomeDoNinja();


    //nem todos os métodos de uma classe abstrata precisam necessriamente ser abstratos
    public void testeDeMetodo() {
        System.out.println("testando esse método");
    }


}
