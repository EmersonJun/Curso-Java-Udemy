package desafioTreino2;

public class Escola {
    public static void main(String[] args) {
        Turma a = new Turma("a");
        Aluno a1 = new Aluno("alan");
        a1.adicionarNota(6.7);
        a1.adicionarNota(9.0);
        a1.adicionarNota(10.0);

        Aluno a2 = new Aluno("alana");
        a2.adicionarNota(10.0);
        a2.adicionarNota(10.0);
        a2.adicionarNota(10.0);

        System.out.println(a1.calcularMediaAluno());
        System.out.println(a2.calcularMediaAluno());

        a.alunos.add(a2);
        a.alunos.add(a1);

        System.out.println("\n" + a.calcularMediaTurma());
    }
}
