package desafioTreino2;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    String nome;
    List<Aluno> alunos = new ArrayList<>();
    public Turma(String nome) {
        this.nome = nome;
    }

    public double calcularMediaTurma(){
        double total = 0;
        for (Aluno aluno : alunos) {
            total += aluno.calcularMediaAluno();
        }
        return total / alunos.size();
    }
}
