import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;
        Stream<String> langs = Stream.of("carlos ", "ana ", "laura \n");
        langs.forEach(print);


        String[] maisLangs = {"carlos", "carla", "maria\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 0, 1   ).forEach(print);


        List<String> outrasLangs = Arrays.asList("ana", "jurema", "maico");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //Stream.generate(()->"a").forEach(print);
        Stream.iterate(0, n -> n +1).forEach(println);
    }
}
