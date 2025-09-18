package nivelBasico;

public class IfEElse {
    public static void main(String[] args) {




        //ninja naruto

        String nome = "Naruto";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 12;


        //se a condição acontecer faça isso
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");

        }else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }


        else {
            System.out.println("Rank: Gennim");
        }
    }
}
