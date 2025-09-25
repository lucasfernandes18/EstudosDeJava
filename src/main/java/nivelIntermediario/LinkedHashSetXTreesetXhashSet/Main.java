package nivelIntermediario.LinkedHashSetXTreesetXhashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

List<String> ninjas = new ArrayList<>();

        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura haruno");
        ninjas.add("Naruto Uzumaki");
        System.out.println(ninjas);

        //set não trabalha com ordenação - index
        //ignora itens duplicados
        Set<String> ninjaSet =  new HashSet<>();
        ninjaSet.addAll(ninjas); // implementa a lista ninjas e remove os itens repetidos

        System.out.println(ninjaSet);
        // como não é trabalhado com index, não é possível tratar um elemento em específico


        /*o treeaSet coloca em ordem de logica. Quando é iniciado um treeSet do tipo string, as informações ficarao em ordem
       alfabética. O int pela sequência de números, e assim por diante.*/
        Set<String> ninjaSet2 = new TreeSet<>();
        ninjaSet2.add("Naruto Uzumaki");
        ninjaSet2.add("Sasuke Uchiha");
        ninjaSet2.add("Sakura haruno");
        ninjaSet2.add("Naruto Uzumaki");
        ninjaSet2.add("Danzo");
        ninjaSet2.add("kakashi hatake");
        System.out.println(ninjaSet2);

        //deixará na ordem de implementação sem deixar repetir elementos
        Set<String> ninjaSet3 = new LinkedHashSet<>();
        ninjaSet3.add("Naruto Uzumaki");
        ninjaSet3.add("Sasuke Uchiha");
        ninjaSet3.add("Sakura haruno");
        ninjaSet3.add("Naruto Uzumaki");
        ninjaSet3.add("Danzo");
        ninjaSet3.add("kakashi hatake");
        System.out.println(ninjaSet3);

    }
}
