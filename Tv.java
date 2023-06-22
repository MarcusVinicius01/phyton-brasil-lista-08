//Ex 06
import java.util.Scanner;

public class Tv {
    private int canal;
    private int volume;

    public void alterarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
        } else {
            System.out.println("Canal inválido.");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void mostrarStatus() {
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        Scanner scanner = new Scanner(System.in);

        boolean ligado = true;

        while (ligado) {
            System.out.println("=== Menu TV ===");
            System.out.println("1. Alterar canal");
            System.out.println("2. Aumentar volume");
            System.out.println("3. Diminuir volume");
            System.out.println("4. Mostrar status");
            System.out.println("5. Desligar TV");
            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número do novo canal: ");
                    int novoCanal = scanner.nextInt();
                    tv.alterarCanal(novoCanal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 4:
                    tv.mostrarStatus();
                    break;
                case 5:
                    ligado = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}
