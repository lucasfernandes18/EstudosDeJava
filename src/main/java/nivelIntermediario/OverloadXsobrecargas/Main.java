package nivelIntermediario.OverloadXsobrecargas;

public class Main {
    public static void main(String[] args) {



      //obj uchiha
        Uchiha itachi = new Uchiha("itachi Uchiha", 20, "Aldeia de folha");
        itachi.habilidadeEspecial();

        //obj uchiha2
        Uchiha madara = new Uchiha("madara Uchiha", "aldeia da folha", 25, 200, NivelNinja.KAGE);
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(100);

//criando um objeto uzumaki
        Uzumaki naruto = new Uzumaki("naruto", "aldeia da folha", 27, 99, NivelNinja.KAGE);



    }


}
