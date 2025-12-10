package encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(20, "carlos", "gabriel");
        p1.setIdade(30);
        p1.setName("jonas");
        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.println(p1.getNomeCompleto());
    }
}
