//Ex 09
class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Retangulo {
    private Ponto pontoInicial;
    private double largura;
    private double altura;

    public Retangulo(Ponto pontoInicial, double largura, double altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto encontrarCentro() {
        double centroX = pontoInicial.getX() + largura / 2;
        double centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
}

public class PontoRetangulo {
    public static void main(String[] args) {
        Ponto pontoInicial = new Ponto(2.5, 3.5);
        Retangulo retangulo = new Retangulo(pontoInicial, 5.0, 4.0);
        Ponto centro = retangulo.encontrarCentro();
        System.out.println("Coordenadas do centro: (" + centro.getX() + ", " + centro.getY() + ")");
    }
}
