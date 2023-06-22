//Ex 17
import java.util.ArrayList;
import java.util.List;

public class FazendaDeBichinhos {
    private List<BichinhoVirtual2> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(BichinhoVirtual2 bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos(int quantidade) {
        for (BichinhoVirtual2 bichinho : bichinhos) {
            bichinho.comer(quantidade);
        }
        System.out.println("Todos os bichinhos foram alimentados.");
    }

    public void brincarComTodos(int minutos) {
        for (BichinhoVirtual2 bichinho : bichinhos) {
            bichinho.brincar(minutos);
        }
        System.out.println("Todos os bichinhos brincaram.");
    }

    public void ouvirTodos() {
        for (BichinhoVirtual2 bichinho : bichinhos) {
            bichinho.mostrarStatus();
        }
    }

    public static void main(String[] args) {
        FazendaDeBichinhos fazenda = new FazendaDeBichinhos();

        BichinhoVirtual2 bichinho1 = new BichinhoVirtual2("Bichinho1");
        BichinhoVirtual2 bichinho2 = new BichinhoVirtual2("Bichinho2");
        BichinhoVirtual2 bichinho3 = new BichinhoVirtual2("Bichinho3");

        fazenda.adicionarBichinho(bichinho1);
        fazenda.adicionarBichinho(bichinho2);
        fazenda.adicionarBichinho(bichinho3);

        fazenda.alimentarTodos(10);
        fazenda.brincarComTodos(20);
        fazenda.ouvirTodos();
    }
}