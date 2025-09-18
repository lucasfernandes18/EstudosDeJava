package nivelIntermediario.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner informacoes = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nome = informacoes.nextLine();
        System.out.println("Digite a idade do ninja: ");
        int idade = informacoes.nextInt();
        informacoes.nextLine();
        System.out.println("Digite a habilidade do ninja: ");
        String habilidade = informacoes.nextLine();
        System.out.println("Digite a habilidade especial: ");
        String habilidadeEspecial = informacoes.nextLine();
        System.out.println("digite a especialidade do ninja: ");
        String especialidade = informacoes.nextLine();


NinjaAvancado Ninja = new NinjaAvancado(nome, idade);
NinjaAvancado habilidades = new NinjaAvancado(habilidade, habilidadeEspecial, especialidade);

Ninja.mostrarInformacoes();
habilidades.executarHabilidades();


informacoes.close();
    }


}
