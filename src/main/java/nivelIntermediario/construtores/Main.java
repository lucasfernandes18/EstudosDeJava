package nivelIntermediario.construtores;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Hocages Hashirama = new Hocages();
        Hashirama.nome = "hashirama";


        Hocages Tobirama = new Hocages("Tobirama");
        System.out.println(Tobirama.nome);

        Hocages Hiruzen = new Hocages(40);
        System.out.println("idade do Hiruzen: " + Hiruzen.idade);


        Hocages Minato = new Hocages("Minato", 32, false);
        System.out.println("nome do Ninja: " + Minato.nome
        + ", idade do Minato: " + Minato.idade);



    }


}
