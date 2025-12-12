import java.lang.reflect.Parameter;
import java.util.function.Function;

@SuppressWarnings("unused")
public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
            numero -> numero % 2 == 0 ? "par": "impar";

            System.out.println(parOuImpar.apply(3));


        Function<String, String> oResultadoE =
            valor -> "o resultado é: " + valor;
        Function<String, String> ancioso =
            valor -> valor + "!!!";
        Function<String, String> duvida =
            valor -> valor + "???";


        String resutadoFInal = parOuImpar
        .andThen(oResultadoE)
        .andThen(ancioso)
        .apply(3);


        System.out.println(resutadoFInal);
        //System.out.println(oResultadoE.apply(parOuImpar.apply(3)));
    }
}
