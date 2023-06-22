//Ex 13
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentualDeAumento) {
        salario += salario * (percentualDeAumento / 100);
    }

    public static void main(String[] args) {
        Funcionario harry = new Funcionario("Harry", 25000.0);
        System.out.println("Salário inicial de " + harry.getNome() + ": R$" + harry.getSalario());

        harry.aumentarSalario(10);
        System.out.println("Salário após aumento: R$" + harry.getSalario());
    }
}
