public class Aluno {
    String nome;
    Double nota;
    boolean bomComportamento;
    boolean criativo;
    int ajudouNaEscola;

    public Aluno(String nome, Double nota, boolean criativo, int ajudouNaEscola){
        this(nome, nota, true, criativo, ajudouNaEscola);
    }

    public Aluno(String nome, Double nota, boolean bomComportamento, boolean criativo, int ajudouNaEscola) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
        this.criativo = criativo;
        this.ajudouNaEscola = ajudouNaEscola;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((nota == null) ? 0 : nota.hashCode());
        result = prime * result + (bomComportamento ? 1231 : 1237);
        result = prime * result + (criativo ? 1231 : 1237);
        result = prime * result + ajudouNaEscola;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (nota == null) {
            if (other.nota != null)
                return false;
        } else if (!nota.equals(other.nota))
            return false;
        if (bomComportamento != other.bomComportamento)
            return false;
        if (criativo != other.criativo)
            return false;
        if (ajudouNaEscola != other.ajudouNaEscola)
            return false;
        return true;
    }
    
}
