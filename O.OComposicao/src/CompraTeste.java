public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "carlos";
        c1.adicionarItem("leite", 1, 10.99);
        c1.adicionarItem("cafe", 1, 30.99);
        c1.adicionarItem("acucar", 2, 09.99);

        System.out.println(c1.itens.size());
        System.out.printf("valor total: %.2f",c1.obterValorTotal());

        double tatal = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("\nvalor total: "+tatal);
    }
}
