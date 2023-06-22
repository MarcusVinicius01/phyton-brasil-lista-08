//Ex 15
public class BichinhoVirtual2 {
    private String nome;
    private int fome;
    private int tedio;

    public BichinhoVirtual2(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.tedio = 50;
    }

    public void comer(int quantidade) {
        fome -= quantidade;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int minutos) {
        tedio -= minutos;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível de fome: " + fome);
        System.out.println("Nível de tédio: " + tedio);
    }

    public static void main(String[] args) {
        BichinhoVirtual2 bichinho = new BichinhoVirtual2("Tamagushi");
        bichinho.comer(20);
        bichinho.brincar(30);
        bichinho.mostrarStatus();
    }
}
