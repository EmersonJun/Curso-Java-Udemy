import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaAprovados = new TreeSet<>();
        //Set<String> listaAprovados = new HashSet<>();

        listaAprovados.add("carlso");
        listaAprovados.add("caso");
        listaAprovados.add("caro");

        for (String canditato : listaAprovados) {
            System.out.println(canditato);
        }

        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(120);
        num.add(3);

        for (Integer n : num) {
            System.out.println(n);
        }
    }
}
