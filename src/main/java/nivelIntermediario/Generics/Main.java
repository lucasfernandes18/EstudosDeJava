package nivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        //super clase object serve para trabalhar com diferentes tipos de objeto
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(7));
        bolsaNinja.adicionarFerramenta(new Pergaminho("invocação do sapo"));

        System.out.println("itens da bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();





    }
    }
