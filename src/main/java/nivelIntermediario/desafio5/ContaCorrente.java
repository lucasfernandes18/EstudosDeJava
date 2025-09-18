package nivelIntermediario.desafio5;

public class ContaCorrente extends ContaBancaria{

public ContaCorrente(double saldo){
    super(saldo);
}

    @Override
    public void depositar(Double valor) {
        if (saldoInicial > 0 ){
            saldoInicial = saldoInicial + valor;
            System.out.println("Saldo atual: " + saldoInicial);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

}
