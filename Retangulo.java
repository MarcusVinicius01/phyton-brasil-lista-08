//Ex 03
public class Retangulo {
    private double ladoA;
    private double ladoB;

    public void mudarValorLados(double novoLadoA, double novoLadoB) {
        ladoA = novoLadoA;
        ladoB = novoLadoB;
    }

    public double retornarValorLadoA() {
        return ladoA;
    }

    public double retornarValorLadoB() {
        return ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}