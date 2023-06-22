//Ex 12
public class ContaInvestimentos {
    private double saldo;
    private double taxaJuros;

    public ContaInvestimentos(double saldo, double taxaJuros) {
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public void adicionarJuros() {
        double juros = saldo * (taxaJuros / 100);
        saldo += juros;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaInvestimentos poupanca = new ContaInvestimentos(1000.0, 10.0);

        for (int i = 1; i <= 5; i++) {
            poupanca.adicionarJuros();
            System.out.println("Saldo após " + i + "º mês: R$" + poupanca.getSaldo());
        }
    }
}
