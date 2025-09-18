package nivelBasico;

import java.util.Scanner;

public class EstudoDeSwichCase {
    public static void main(String[] args) {
//  SwitchCases: servem para gerar casos específicos
// Objetivo: Pedir para o usuário escolher entre os ninjas


// Pedir para o usuário

Scanner scanner = new Scanner(System.in);
//mostrar opções para o usuário

        System.out.println("Digite o nome do seu ninja: ");

        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

// Pedir para o usuário escolher uma das opções:
        System.out.println("escolha um ninja");

        int escolhaDoUsuario = scanner.nextInt();

//reação ao escolher um personagem:

switch(escolhaDoUsuario){
    case 1:
        System.out.println("você escolheu o ninja Naruto Uzumaki");
        break;

    case 2:
        System.out.println("você escolheu o ninja Sasuke Uchiha");
        break;

        case 3:
            System.out.println("você escolheu o ninja Sakura Haruno");
            break;

            default:
                System.out.println("você não escolheu uma resposta válida");

}


scanner.close();

    }
}
