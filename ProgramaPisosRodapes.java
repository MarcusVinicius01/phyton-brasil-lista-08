//Ex 3,5
import java.util.Scanner;

public class ProgramaPisosRodapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do local em metros: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do local em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do piso em metros: ");
        double larguraPiso = scanner.nextDouble();

        System.out.println("Digite a largura do rodapé em metros: ");
        double larguraRodape = scanner.nextDouble();

        double areaLocal = largura * comprimento;
        double areaPiso = larguraPiso * larguraPiso;
        double areaRodape = larguraRodape * comprimento;

        int quantidadePisos = (int) (areaLocal / areaPiso);
        int quantidadeRodapes = (int) (2 * (largura + comprimento) / larguraRodape);

        System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);
        System.out.println("Área do local: " + areaRodape);

        scanner.close();
    }
}