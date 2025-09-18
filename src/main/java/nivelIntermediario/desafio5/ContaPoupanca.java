package nivelIntermediario.desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(Double valor) {
        if (valor >= 0) {
            double taxa = valor * 0.1;
            double valorLiquido = valor - taxa;
            saldoInicial += valorLiquido;
            System.out.println("Saldo atual: " + saldoInicial);

        } else {
            System.out.println("valor invalido");
        }

    }



}
