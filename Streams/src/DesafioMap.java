import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        //Consumer<String> print = System.out::print;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6 ,6, 7, 8, 9);

        UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> paraDecima = n -> Integer.parseInt(n, 2);
        // UnaryOperator<Integer> binario = n -> n.toBinaryString();

        nums.stream()
            .map(Integer::toBinaryString)
            .map(inverter)
            .map(paraDecima)
            .forEach(System.out::print);
    }
}
