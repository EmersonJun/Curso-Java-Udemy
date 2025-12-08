package desafioTreino;

public class EmprestimoTeste {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Hobbit", "Tolkien", 1937);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l3 = new Livro("1984", "George Orwell", 1949);
        Livro l4 = new Livro("Clean Code", "Robert C. Martin", 2008);

        // Criando usuários
        Usuario u1 = new Usuario("Cezar");
        Usuario u2 = new Usuario("Marina");

        // Criando empréstimos
        new Emprestimo(l1, u1);
        new Emprestimo(l2, u1);
        new Emprestimo(l4, u1);

        new Emprestimo(l3, u2);

        // Mostrando resultados
        u1.exibirLivrosEmprestados();
        u2.exibirLivrosEmprestados();

        System.out.println("Total empréstimos de " + u1 + ": " + u1.obterTotalEmprestimos());
        System.out.println("Total empréstimos de " + u2 + ": " + u2.obterTotalEmprestimos());
    }
}
