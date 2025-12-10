package Desafios.desafioTreino2;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Double>notas = new ArrayList<>();
    

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarNota(Double nota){
        notas.add(nota);
    }

    public double calcularMediaAluno(){
        double total = 0;
        for (Double nota : notas) {
            total += nota;
        }
        return total / notas.size();
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", notas=" + notas + "]";
    }
    
    
}
