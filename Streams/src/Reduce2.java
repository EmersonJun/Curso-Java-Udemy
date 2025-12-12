import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("carlos", 0.5, true, 3);
        Aluno a2 = new Aluno("ana", 1.5, true, 0);
        Aluno a3 = new Aluno("alan", 8.5, true, 3);
        Aluno a4 = new Aluno("julia", 3.5,  true, 3);
        Aluno a5 = new Aluno("caroooolos", 9.5, false, 1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate()  ;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;


        // alunos.parallelStream()
        //     .filter(aprovado)
        //     .map(apenasNota)
        //     .reduce(somatorio)
        //     .ifPresent(System.out::println);

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
