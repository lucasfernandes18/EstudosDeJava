package DesafioNinja;

import org.w3c.dom.ls.LSOutput;

public class main{

    public static void main(String[] args) {
        System.out.println("-----------------");
            String nome = "Naruto Uzumaki ";
            int idade = 13;
            String missao = " roubar lula ";
        char dificuldade1 = 'D';
        String conclusao = "Em andamento";

        //verifgicar nivelk da missao e idade do ninja
        if (idade < 15) {
            if (dificuldade1 == 'C' || dificuldade1 == 'D') {
                conclusao = "Concluida";
            }else {
                conclusao = "não concluida";

            }

        }else {
            conclusao = "concluida";
        }



        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Dificuldade1: " + dificuldade1);
        System.out.println("Conclusao: " + conclusao);

        System.out.println("-----------------");


        String nome2 = "Sasuke";
        int idade2 = 20;
        String missao2 = "reconhecer area";
        char dificuldade2 = 'B';
        String conclusao2 = "concluída";

        //verifgicar nivelk da missao e idade do ninja
        if (idade < 15) {
            if (dificuldade2 == 'C' || dificuldade2 == 'D') {
                conclusao2 = "Concluida";
            }else {
                conclusao2 = "não concluida";

            }

        }else {
            conclusao2 = "concluida";
        }


        System.out.println("Nome do ninja: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Dificuldade1: " + dificuldade2);
        System.out.println("Conclusao: " + conclusao2);

        System.out.println("-----------------");

        String nome3 = "Naruto Uzumaki ";
        int idade3 = 12;
        String missao3 = " roubar lula ";
        char dificuldade3 = 'C';;
        String conclusao3 = "concluída";

        //verifgicar nivelk da missao e idade do ninja
        if (idade < 15) {
            if (dificuldade3 == 'C' || dificuldade3 == 'D') {
                conclusao3 = "Concluida";
            }else {
                conclusao3 = "não concluida";

            }

        }else {
            conclusao3 = "concluida";
        }




        System.out.println("Nome do ninja: " + nome3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Dificuldade1: " + dificuldade3);
        System.out.println("Conclusao: " + conclusao3);

        System.out.println("-----------------");




    }
}
