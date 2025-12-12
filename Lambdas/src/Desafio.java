import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        

        Function<Produto, Double> precoFinal = 
            produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> ImpostoMunicipal = 
            preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = 
            preco -> preco >= 3000 ? preco + 100 : preco + 50;


    // UnaryOperator<Double> arredondar = 
    // preco -> Double.parseDouble(String.format("%.2f", preco));

    //retornou erro por tranformar . em ,

       UnaryOperator<Double> arredondar =
            preco -> Math.round(preco * 100.0) / 100.0;


        Function<Double, String> formatar = 
            preco -> ("R$ "+ preco).replace(".", ",");
        

        Produto p = new Produto("ipad", 3235.89, 0.13);   
        String preco = precoFinal
                .andThen(ImpostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p); 
        
        System.out.println("o preco final é: "+ preco);
    }
}
