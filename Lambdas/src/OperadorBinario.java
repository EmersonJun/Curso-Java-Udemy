import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = 
            (Double n1, Double n2) -> (n1 + n2)/ 2;

        System.out.println(media.apply(9.9, 3.5));


        BiFunction<Double, Double, String> resultado =
            (n1, n2) -> {
                double notaFInal = ((n1 + n2) / 2); 
                return notaFInal  >= 7 ? "aprovado" : "reprovado";
            };

            System.out.println(resultado.apply(9.8, 9.5));


        Function<Double, String> conceito = 
            m -> m >= 7 ? "aprovado" : "Reprovado";

            System.out.println(media.andThen(conceito).apply(9.8, 3.5));
    }
}
