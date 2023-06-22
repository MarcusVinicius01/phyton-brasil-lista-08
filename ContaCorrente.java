//Ex 05
public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldoInicial;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque) {
        if (valorSaque <= saldo) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
