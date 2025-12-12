import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("carlos", 0.5, true, true, 3);
        Aluno a2 = new Aluno("ana", 1.5, false, true, 0);
        Aluno a3 = new Aluno("alan", 8.5, true, true, 3);
        Aluno a4 = new Aluno("julia", 3.5, true, true, 3);
        Aluno a5 = new Aluno("caroooolos", 9.5, false, false, 1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> comportado = a -> a.bomComportamento;
        Predicate<Aluno> criativo = a -> a.criativo;
        Predicate<Aluno> ajudou = a -> a.ajudouNaEscola >= 2;
        Function<Aluno, String> mensagem = a -> a.nome + " parabens, voce esta aprovado";

        alunos.stream()
            .filter(aprovado)
            .filter(comportado)
            .filter(ajudou)
            .filter(criativo)
            .map(mensagem)
            .forEach(System.out::println);
    }
}
