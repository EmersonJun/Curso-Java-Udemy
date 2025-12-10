package Desafios.desafioTreino;

public class Emprestimo {
    Livro livro;
    Usuario usuario;
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;

        usuario.adcionarEmprestimo(livro);
    }
    @Override
    public String toString() {
        return "Emprestimo [livro=" + livro + ", usuario=" + usuario + "]";
    }

    
}
