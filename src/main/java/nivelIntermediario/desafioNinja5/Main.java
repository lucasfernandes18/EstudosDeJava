package nivelIntermediario.desafioNinja5;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //iniciar uma linkedList com 7 ninjas

List<Ninja> listaDeNinjas = new LinkedList<>();
listaDeNinjas.add(new Ninja(1,"Naruto Uzumaki", 19, "aldeia da folha"));
listaDeNinjas.add(new Ninja(2,"Sasuke Uchiha", 17, "aldeia da folha"));
listaDeNinjas.add(new Ninja(3,"Sakura Haruno", 14, "aldeia da folha"));
listaDeNinjas.add(new Ninja(4, "Kakashi Hatake", 20, "aldeia da folha"));
listaDeNinjas.add(new Ninja(5,"Jiraya", 41, "aldeia da folha"));
listaDeNinjas.add(new Ninja(6,"Itachi Uchiha", 18, "aldeia da folha"));
listaDeNinjas.add(new Ninja(7,"Rock Lee", 32, "aldeia da folha"));

        System.out.println("------------Listar os Ninjas-----------");

        //listar os ninjas
        //cria um objeto ninja que percorre a lista dos ninjas
        for(Ninja ninja : listaDeNinjas){
            System.out.println(ninja);
        }

        System.out.println("------------Adicionando os Ninjas-----------");
        //adicionar o ninja no inicio da lista
        listaDeNinjas.addFirst(new Ninja(8,"Tsunade", 19, "aldeia da folha"));
        for(Ninja ninja : listaDeNinjas){
            System.out.println(ninja);
        }

        //remover o ninja no inicio da list
        System.out.println("------------Ninja removido-----------");
 Ninja removido = listaDeNinjas.removeLast();
        System.out.println(removido);



        //procurar um ninja por indice
        System.out.println("------------exibindo o ninja por indice-----------" );
Ninja terceiroNinja = listaDeNinjas.get(2);
        System.out.println(terceiroNinja);
        Scanner buscarNinja = new Scanner(System.in);

        System.out.println("===============interação com o usuário==============" );
        System.out.println("digite o indice do ninja que deseja da lista acima:");
        int idDoNinja = buscarNinja.nextInt();
        for(Ninja ninja : listaDeNinjas){
            System.out.println(ninja);
        }

      Ninja ninjaEscolhido = listaDeNinjas.get(idDoNinja);
        System.out.println(ninjaEscolhido);
















        buscarNinja.close();


    }
}
