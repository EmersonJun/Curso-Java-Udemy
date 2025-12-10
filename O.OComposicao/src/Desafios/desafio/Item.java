package Desafios.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    int quantidade;
    Produto produto; 

    List<Produto> produtos = new ArrayList<>();
    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
}
