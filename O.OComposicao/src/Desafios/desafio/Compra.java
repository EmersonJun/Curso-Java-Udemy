package Desafios.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome,Double preco, int quantidade){
        var produto = new Produto(preco, nome);
        this.itens.add(new Item(quantidade, produto));
    }

    public double obterValorTotal(){
        double total = 0;
            for (Item item : itens) {
                total += item.quantidade * item.produto.preco;
            }
        return total;
    }
    
}
