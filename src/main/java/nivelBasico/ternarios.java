package nivelBasico;

public class ternarios {
    public static void main(String[] args) {
        //ternários substituem o if e else, tornando o código mais limpo

        short numeroDeMissoes = 10;

        String nivelDoNinja = (numeroDeMissoes >= 10) ? "o ninja já está preparado" : "o ninja ainda não tem missoes suficientes";
        System.out.println(nivelDoNinja);

int nivelDoStage = 2;

String daPauOuNem = (nivelDoStage > 3) ? "da pau em up já" : "fica pra trás bmw";
        System.out.println(daPauOuNem);

    }
}
