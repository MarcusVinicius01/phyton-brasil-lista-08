//Ex 11
public class Carro {
    private double consumoCombustivel;
    private double quantidadeCombustivel;

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.quantidadeCombustivel = 0.0;
    }

    public void andar(double distancia) {
        double combustivelNecessario = distancia / consumoCombustivel;
        if (combustivelNecessario <= quantidadeCombustivel) {
            quantidadeCombustivel -= combustivelNecessario;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("O carro não possui combustível suficiente para percorrer essa distância.");
        }
    }

    public double obterGasolina() {
        return quantidadeCombustivel;
    }

    public void adicionarGasolina(double quantidade) {
        quantidadeCombustivel += quantidade;
        System.out.println("Abastecido com " + quantidade + " litros de combustível.");
    }

    public static void main(String[] args) {
        Carro meuFusca = new Carro(15);
        meuFusca.adicionarGasolina(20);
        meuFusca.andar(100);
        System.out.println("Combustível restante: " + meuFusca.obterGasolina() + " litros.");
    }
}
