package nivelIntermediario.desafio2;

import java.util.Scanner;



    public class NinjaBasico implements Ninja {

            public String nome;
            public int idade;
            public String habilidade;
            public String habilidadeEspecial;

            @Override
            public void mostrarInformacoes() {

                System.out.println("digite o nome do ninja: ");

                System.out.println("digite a idade do ninja: ");

                System.out.println("digite a habilidade do ninja: ");

                System.out.println("digite a habilidade do ninja: ");

                System.out.println("//////////////////");

            }
            @Override
            public void executarHabilidades() {
                System.out.println(nome + " executou a habilidade " + habilidade);
                System.out.println(nome + " usou sua habilidade especial " + habilidadeEspecial);
            }
        }







