package nivelIntermediario.ArrayListXlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Arrays------------");
//Array
// são estático, não alteram o tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("printando array = " + ninjasArray[0]);

        //listas
        //listas são estáticas, aumentam de tamanho

        System.out.println("------------Listas------------");

        List<String> ninjasList = new ArrayList<>();
        System.out.println("------------adicionar na lista------------");
        //adicionar na lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");

        System.out.println("Ninjas list = " + ninjasList.get(5));

        System.out.println("------------remover na lista------------");
        //remover da lista
        ninjasList.remove("Naruto Uzumaki");
        System.out.println("Ninjas list = " + ninjasList);

        System.out.println("------------trocar elementos------------");
        //trocar elementos
        ninjasList.set(1 , "tobirama");
        System.out.println(ninjasList);

        System.out.println("------------ver o tamanho da lista------------");
        //ver o tamanho da lista
        System.out.println("numero de elementos: " + ninjasList.size());





    }
}
