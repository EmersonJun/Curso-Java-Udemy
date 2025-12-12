package PersonalizadaB;

public class Validar {
    private Validar(){}

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroNegativoException{
        if (aluno == null) {
            throw new IllegalArgumentException("o aluno esta nulo");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroNegativoException("nota");
        }
    }
}
