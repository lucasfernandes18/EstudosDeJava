package nivelIntermediario.RevisaoXarrayXstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("===============Array===============");
        //Arrays
        //sao estáticos e precisam que aloque o espaço na memória
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura haruno ";
        System.out.println("NomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nome do ninja da posição 0 = " + nomeNinjaArray[0]);


        System.out.println("===============Lista===============");
        //nas listas não existe predefinição de memória
        //lista é uma estrutura de dados mais lenta em relação ao array

        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Sasuke Uchiha");

        //não precisa utilizar nenhum loop para exibir a lista inteira, isso já é tratado automaticamente pelo java utilizando o método toString.
        System.out.println(nomeNinjaList);

        System.out.println("===============Stack===============");
        Stack<String> nomeNinjaStack = new Stack<>();
        // o stack é uma pilha - ultimo a entrar, primeio a sair
        //push equivalente ao add.
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("mostrar stack = " + nomeNinjaStack);
        System.out.println("tirar da pilha = " + nomeNinjaStack.pop());
        System.out.println("mostrar stack = " + nomeNinjaStack);
        System.out.println("mostrar proximo elemento do topo da pilha = " + nomeNinjaStack.peek());




    }
}
