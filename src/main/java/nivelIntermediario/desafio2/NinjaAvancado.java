package nivelIntermediario.desafio2;

import java.util.Scanner;

    public class NinjaAvancado implements Ninja {

            public String nome;
            public int idade;
            public String habilidade;
            public String habilidadeEspecial;
            public String especialidade;

        public NinjaAvancado(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;

        }
        public NinjaAvancado(String habilidade, String habilidadeEspecial, String especialidade) {
            this.habilidade = habilidade;
            this.habilidadeEspecial = habilidadeEspecial;
            this.especialidade = especialidade;
        }

        @Override
            public void mostrarInformacoes() {

                System.out.println("nome do ninja: " + this.nome);
                System.out.println("idade do ninja: "  + this.idade);


            }
            @Override
            public void executarHabilidades() {
                System.out.println("executou a habilidade: " + habilidade);
                System.out.println("usou sua habilidade especial: " + habilidadeEspecial);
                System.out.println("sua especialidade é: " + especialidade);
            }
        }





