package nivelIntermediario.heranca;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //criar um método público personalizado

//o método void não retorna nada


    //precisa retornar uma String
    public String euSouUmNinja (){
        return "oi, eu sou um ninja";
    }

    //Precisa retornar um número inteiro

    public int idadeDoNinja (){
        return 10;
    }

    /*
    * passa como parâmetro uma variável criada e depois diminúi ela da idade do ninja*/
public int anosParaSeTornarUmHokage (int idadeMinimaParaSeTornarUmHokage) {
        return idadeMinimaParaSeTornarUmHokage - idade;

}


}





