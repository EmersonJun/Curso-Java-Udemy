public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("notebook", 1000, 0.1);
        // p1.nome = "notebook";
        // p1.preco = 1000;
        // p1.desconto = 1.5;

        var p2 = new Produto("notebook", 1000, 0.1);
        // p2.nome = "notebook";
        // p2.preco = 1000;
        // p2.desconto = 0.5; 

        double precoFinal = p1.preco * (1 - p1.desconto);
        double precoFinalTeste = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1); // com metodos
        System.out.println(precoFinal);
        System.out.println("\n"+precoFinal2);
    }
}
