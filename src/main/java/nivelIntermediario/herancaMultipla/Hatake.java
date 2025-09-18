package nivelIntermediario.herancaMultipla;



public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {
    public void boasVindas(){
        System.out.println(nome + " eu sou um hatake");
    }



    //método da interface
    @Override
    public void ativandoSharingan() {
        System.out.println(nome + " ativando o Sharingan");
    }
    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " eu sou um ninja de elite");
    }
}
