package nivelIntermediario.herancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {

    //esse método vem direto da interface
    @Override
    public void ativandoSharingan() {
        System.out.println(nome + " ativando o Sharingan");
    }
}
