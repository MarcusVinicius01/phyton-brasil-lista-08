//Ex 01
public class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public void trocaCor(String novaCor) {
        cor = novaCor;
    }

    public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);
    }
}