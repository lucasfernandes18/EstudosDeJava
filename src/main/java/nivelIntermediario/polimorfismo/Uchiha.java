package nivelIntermediario.polimorfismo;

public class Uchiha extends Ninja{


    //sobrescreve o método generico da classe ninja utilizado por todos
    @Override
    public void habilidadeEspacial() {
        System.out.println("me nome é "  + nome +  "e esse é  meu ataque uchiha");
    }
}
