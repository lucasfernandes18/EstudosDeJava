package nivelIntermediario.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        //sao estáticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "naruto Uzumaki";

        //Listas
        //São dinâmeicas, tamanho aumenta e diminui conforme a necessidade
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto uzumaki");

        //Stack
        //O ultimo elemento que entrou, obrigatoriamente é o primeiro a sair.
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura haruno");
        ninjasStack.push("Hinata hyuga ");
        ninjasStack.push("Kakashi hatake");
        System.out.println("minha stack atual = " + ninjasStack);
        //retirar o ultimo elemento da lista
        ninjasStack.pop();
        System.out.println("minha stack atualizada com pop: " + ninjasStack);
        //visualização com peek
        System.out.println("minha stack atualizada com o proximo elemento do topo: " + ninjasStack.peek());
        //tamanho da stack
        System.out.println("tamanho da stack: " + ninjasStack.size() + " Elementos");





        }
}
