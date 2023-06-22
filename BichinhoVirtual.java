//Ex 07
public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public void alterarNome(String novoNome) {
        nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        fome = novaFome;
    }

    public void alterarSaude(int novaSaude) {
        saude = novaSaude;
    }

    public void alterarIdade(int novaIdade) {
        idade = novaIdade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public int calcularHumor() {
        return fome + saude;
    }

    public static void main(String[] args) {
        BichinhoVirtual bichinho = new BichinhoVirtual();
        bichinho.alterarNome("Tamagushi");
        bichinho.alterarFome(5);
        bichinho.alterarSaude(7);
        bichinho.alterarIdade(3);

        System.out.println("Nome: " + bichinho.retornarNome());
        System.out.println("Fome: " + bichinho.retornarFome());
        System.out.println("Saúde: " + bichinho.retornarSaude());
        System.out.println("Idade: " + bichinho.retornarIdade());
        System.out.println("Humor: " + bichinho.calcularHumor());
    }
}
