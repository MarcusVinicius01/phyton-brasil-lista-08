//Ex 04
public class Pessoa {
    
    String nome;
    int idade;
    double peso;
    double altura;
    int anosPassados;

    void setEnvelhecer(int anosPercorridos){
        idade = (idade + anosPercorridos);
    }
    void emagracer(int quilogramas){
        peso = peso - quilogramas;
    }
    void engordar(int quilogramas){
        peso = peso + quilogramas;
    }
    void envelhecer(int anosPassados){
        idade = idade + anosPassados;
    }
    void crescer(int anosPassados){
        altura = altura + (anosPassados * 0.5);
    }
}
/*nome, idade, peso e altura
Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que nossa pessoa envelhece,
sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.*/