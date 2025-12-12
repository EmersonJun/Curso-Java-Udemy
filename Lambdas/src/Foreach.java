import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("ana", "carlos","jona");

        System.out.println("forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }


        System.out.println();
        System.out.println("lambda 01");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));


        System.out.println();
        System.out.println("Method Preference 01");
        aprovados.forEach(System.out::println);


        System.out.println();
        System.out.println("lambda 02");
        aprovados.forEach(nome -> meuImprimir(nome));


        System.out.println();
        System.out.println("Method Preference 02");
        aprovados.forEach(Foreach::meuImprimir);
    }
    static void meuImprimir(String nome){
            System.out.println("oi meu nome é " + nome);
        }
}
