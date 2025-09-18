package nivelIntermediario.herancaMultipla;

import nivelIntermediario.polimorfismoXabstracao.Uzumaki;

public class Main {
    public static void main(String[] args) {
        // obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.ativandoSharingan();


        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.idade = 18;
        kakashi.aldeia = "Aldeia da folha";
        kakashi.boasVindas();
kakashi.ativandoSharingan();
kakashi.ninjaDeElite();


    }
}
