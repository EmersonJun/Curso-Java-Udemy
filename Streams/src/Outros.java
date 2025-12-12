import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("carlos", 0.5, true, 3);
        Aluno a2 = new Aluno("ana", 1.5, true, 0);
        Aluno a3 = new Aluno("alan", 8.5, true, 3);
        Aluno a4 = new Aluno("julia", 3.5,  true, 3);
        Aluno a5 = new Aluno("caroooolos", 9.5, false, 1);
        Aluno a6 = new Aluno("carlos", 0.5, true, 3);
        Aluno a7 = new Aluno("ana", 1.5, true, 0);
        Aluno a8 = new Aluno("alan", 8.5, true, 3);
        Aluno a9 = new Aluno("julia", 3.5,  true, 3);
        Aluno a10 = new Aluno("caroooolos", 9.5, false, 1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);

        System.out.println("distinct....");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nskip/limit");
        alunos.stream()
            .distinct()
            .skip(2)
            .limit(2)
            .forEach(System.out::println);

        System.out.println("\ntakewhile");
        System.out.println("\nskip/limit");
        alunos.stream()
            .distinct()
            .takeWhile(a -> a.nota >= 7)
            .forEach(System.out::println);
    }
}
