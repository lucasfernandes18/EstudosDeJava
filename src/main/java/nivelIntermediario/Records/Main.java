package nivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("naruto", "naruto@gmail.com", 99999);
        System.out.println(cadastro);

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("sasuke", "sasuke@gfmail.com", 000000);
        System.out.println(cadastroUsandoRecord.emailCaixaAlta());


    }
}
