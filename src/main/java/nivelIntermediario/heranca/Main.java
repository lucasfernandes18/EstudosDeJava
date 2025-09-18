package nivelIntermediario.heranca;

public class Main {
    public static void main(String[] args) {
        //criar o ninja naruto
/*
        String nome = "Naruto Uzumaki";
        int idade = 20;
        String aldeia = "aldeia da folha";
*/
//criar um ninja usando classes externas
        // criando o ninja sasuke passando ele como um objeto
        int idadeMinimaParaSeTornarUmHokage;


        //obj1
   Uchiha Sasuke = new Uchiha();
   Sasuke.nome = "Sasuke";
   Sasuke.idade = 18;
   Sasuke.aldeia = "Aldeia da folha";
   Sasuke.SharinganAtivado();



        //criando o ninja naruto obj2
       Uzumaki Naruto = new Uzumaki();
       Naruto.nome = "Naruto";
       Naruto.idade = 18;
       Naruto.aldeia = "Aldeia da folha";
       Naruto.ModoSabioAtivado();



        //criando o nunja Sakura -obj3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.AtivarCura();

        //criando o ninja hinata -obj 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.ativarVisaoPoderosa();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto hyuga";
        Boruto.idade = 18;
        Boruto.aldeia = "Aldeia da folha";
        /*
        * por ter sido utilizado um interface para juntar as classes boruto e hyuga,
        * agora o acesso é liberado para todos os atributos e métodos utilizado por essas classes,
        * inclusive a da classe Pai
        * */
        Boruto.ModoSabioAtivado();


    }
}
