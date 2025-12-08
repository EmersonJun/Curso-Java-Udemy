package desafioTreino;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    List<Livro> livros = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }
    public void adcionarEmprestimo(Livro livro){
        livros.add(livro);
    }
    public int obterTotalEmprestimos(){
        return livros.size();
    }
    public void exibirLivrosEmprestados(){
        System.out.println("livros emprestados do usuario" + nome + ":");
        for (Livro livro : livros) {
            System.out.println("\n-" + livro);
        }
        System.out.println();
    }
    @Override
public String toString() {
    return nome;
}

}
