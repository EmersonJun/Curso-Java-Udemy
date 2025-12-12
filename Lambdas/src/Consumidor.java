import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("cafe", 30.00, 0.15);
        Produto p2 = new Produto("leite", 10.00, 0.15);
        imprimir.accept(p1);


        List<Produto> produtos = Arrays.asList(p1, p2);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}   
