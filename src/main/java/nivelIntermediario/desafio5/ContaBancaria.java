package nivelIntermediario.desafio5;

public abstract class ContaBancaria  implements Conta{
    double saldoInicial;

    public ContaBancaria(double saldo) {
        this.saldoInicial = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldoInicial);

    }
    @Override
    public void depositar(Double valor) {

    }
}


