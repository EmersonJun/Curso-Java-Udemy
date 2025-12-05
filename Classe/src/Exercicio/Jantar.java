package Exercicio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("gui", 99.0);
        Comida c = new Comida("feijao", 0.50);
        Comida c2 = new Comida("arroz", 0.50);
        Comida c3 = new Comida("carne", 5.0);

        System.out.println(p.apresentar());
        p.Comer(c);
        p.Comer(c2);
        p.Comer(c3);
        System.out.println(p.apresentar());
    }
}
