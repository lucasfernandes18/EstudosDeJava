package nivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    //inicializar o array
    private List<T> ferramentas;

    //construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //colocar ferramentas no Array
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //mostrar a lista de ferramenta
    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
//":" significa: “para cada ferramenta dentro da lista ferramentas, imprima essa ferramenta”.



}
