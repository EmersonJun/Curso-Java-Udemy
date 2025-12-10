package Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(60.0);
        Feijao f = new Feijao(0.25);
        Arroz a = new Arroz(0.25);
        Sorvete s = new Sorvete(0.25);

        convidado.comer(a);
        convidado.comer(f);
        convidado.comer(s);
        
        System.out.println(convidado.getPeso());
    }
}
