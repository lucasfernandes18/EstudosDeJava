package nivelBasico;

import java.util.Scanner;

public class scanners {
    public static void main(String[] args) {
        //scanner é um jeito de trazer o usuário para dentro da aplicação
        //objetivo: o usuário vai criar um ninja e vamos validar os dados

// receber o nome do ninja
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("digite aqui o nome do ninja: ");

        String nomeDoNinja = caixaDeTexto.nextLine();

        System.out.println("o nome do ninja é: " + nomeDoNinja);

        // receber a idade do ninja

        System.out.println("escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("o nome do seu ninja é " + nomeDoNinja + " e a sua idade é de: " + idadeDoNinja + " anos");

//tratando os dados
        if (idadeDoNinja >= 18) {
            System.out.println("esse ninja já é maior de idade e pode ir para missões fora da aldeia");

        } else {
            System.out.println("esse ninja é muito novo ainda, precisa treinar mais");
        }


        //fechar sempre o Scanner
        caixaDeTexto.close();


    }
}