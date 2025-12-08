package desafioTreino;

public class Livro {
    String titulo;
    String autor;
    int data;
    public Livro(String titulo, String autor, int data) {
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", data=" + data + "]";
    }
}
