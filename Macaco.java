//Ex 08
public class Macaco {
    private String nome;
    private String bucho;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = "";
    }

    public void comer(String comida) {
        if (bucho.isEmpty()) {
            bucho += comida;
        } else {
            bucho += ", " + comida;
        }
    }

    public void verBucho() {
        if (bucho.isEmpty()) {
            System.out.println("O bucho está vazio.");
        } else {
            System.out.println("Bucho: " + bucho);
        }
    }

    public void digerir() {
        if (!bucho.isEmpty()) {
            System.out.println("Digerindo comida: " + bucho);
            bucho = "";
        } else {
            System.out.println("O macaco não comeu nada para digerir.");
        }
    }

    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Macaco 1");
        Macaco macaco2 = new Macaco("Macaco 2");

        macaco1.comer("Banana");
        macaco2.comer("Maçã");
        macaco1.comer("Uva");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();
    }
}
