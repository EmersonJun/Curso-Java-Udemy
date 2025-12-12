import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("gabriel", "guilherme", "tibor");

        // for(int i = 0; i < aprovados.size(); i++){
        //     System.out.println(aprovados.get(i));
        // }

        System.out.println("usando o fereach");
        for (String nome : aprovados) {
            System.out.println(nome);
        }


        System.out.println("\nusando o interator");
        Iterator<String> iterator = aprovados.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        System.out.println("\n usando o stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //laco interno
    }
    
}
