package desafioTreino3;

public class agenciaTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("carlos");
        Cliente c2 = new Cliente("alana");

        Conta co1 = new Conta(111, 100);
        Conta co2 = new Conta(222, 100);

        c1.contas.add(co1);
        c2.contas.add(co2);

        co1.depositar(100);
        System.out.println(c1.contas);
        System.out.println(c2.contas);

        co2.sacar(50);
        System.out.println(c1.contas);
        System.out.println(c2.contas);

        co1.tranferir(100, co2);
        System.out.println(c1.contas);
        System.out.println(c2.contas);
    }
}
