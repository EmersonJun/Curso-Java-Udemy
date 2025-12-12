import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Clientes c1= new Clientes("pedro", 2345.00, true);
        Clientes c2= new Clientes("carlos", 500.00, false);
        Clientes c3= new Clientes("jonas", 45.00, true);

        List<Clientes> clientes = Arrays.asList(c1, c2, c3);
        Predicate<Clientes> bomCliente = c -> c.devendo <= 1000 && c.atrasaPagamento;
        Function<Clientes, String> mensagem = c -> c.nome  +" É um bom cliente";

        clientes.stream()
            .filter(bomCliente)
            .map(mensagem)
            .forEach(System.out::println);
    }
}
