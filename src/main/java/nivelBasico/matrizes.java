package nivelBasico;

public class matrizes {
    public static void main(String[] args) {
        /*
        as matrizes são arrays de referência, primeiro é colocado a linha e depois a coluna
         */
//no primeiro eslote está as aldeias e depois os ninjas

        String[][] ninjasEaldeia = new String[3][3];
        ninjasEaldeia[0][0] = "Konaha";
        ninjasEaldeia[0][1] = "Naruto Uzumaki";
        ninjasEaldeia[0][2] = "Sasuke Uchiha";

        ninjasEaldeia[1] [0]= "Nevoa";
        ninjasEaldeia[1] [1] = "Zabuza";
        ninjasEaldeia[1] [2] = "Haru";

       for (int i=0; i<ninjasEaldeia.length; i++) {
           //printa todos os elementos da primeira linha
           System.out.println(ninjasEaldeia[0][i]);
           System.out.println("--------");
           //mostra todos os elementos da primeira coluna
           System.out.println(ninjasEaldeia[i][1]);
       }

       }

}
