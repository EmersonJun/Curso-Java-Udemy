public class AlunoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("carlos");
        Aluno a2 = new Aluno("caos");
        Aluno a3 = new Aluno("carl");

        Curso c1 = new Curso("C");
        Curso c2 = new Curso("java");
        Curso c3 = new Curso("PY");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);

        c2.adicionarAluno(a2);
        c2.adicionarAluno(a3);

        a2.adicionarAluno(c3);
        a3.adicionarAluno(c3);
        a1.adicionarAluno(c3);

        for (Aluno alunos : c1.alunos) {
            System.out.println(alunos.nome);
        }

        System.out.println(a1.cursos.get(0).alunos);

        Curso cursoencontrado = a1.obterCursoProcurado("Py");

        if (cursoencontrado != null) {
            System.out.println(cursoencontrado.nome);
            System.out.println(cursoencontrado.alunos);
        } else {
            System.out.println("nao encontrado");
        }
    }
}
