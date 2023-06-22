//Ex 10
public class BombaDeCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaDeCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Litros abastecidos: " + litrosAbastecidos);
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Valor a pagar: R$" + valorPagar);
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
    }

    public static void main(String[] args) {
        BombaDeCombustivel bomba = new BombaDeCombustivel("Gasolina", 4.5, 100.0);

        bomba.abastecerPorValor(50);
        bomba.abastecerPorLitro(20);

        bomba.alterarValor(5.0);
        bomba.alterarCombustivel("Etanol");
        bomba.alterarQuantidadeCombustivel(150.0);
    }
}
