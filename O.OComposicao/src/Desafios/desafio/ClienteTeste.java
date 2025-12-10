package Desafios.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Compra co1 = new Compra();
        co1.adicionarItem("leite", 10.0, 10);
        co1.adicionarItem("cafe", 20.0, 10);

        Compra co2 = new Compra();
        co2.adicionarItem("acucar", 5.0, 10);
        co2.adicionarItem("sal", 15.0, 10);
        Cliente c1 = new Cliente("cezar");
        
        c1.compras.add(co1);
        System.out.println(c1.obterCompraTotal());
        c1.compras.add(co2);
        System.out.println(c1.obterCompraTotal());
    } 
}
