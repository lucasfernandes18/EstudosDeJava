package nivelIntermediario.LinkedListCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

// colection é uma interface que é implementada por várias estruturas de dados

        //Classes List que implementam a interface collection
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        //não é necessário utilizar o metodo toString nesse caso porque ná interface collection já hà esse tratamento
        System.out.println(linkedList);

        //diferente do array, que não está no fuarda-chuva do collection e é necessário usar o método toString.
        String[] ninja = new String[1];
        ninja[0] = "Naruto";
        System.out.println(ninja);


        //interface que estendem collection
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();






    }
}
