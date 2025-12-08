package desafioTreino3;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Conta> contas = new ArrayList<>();
    public Cliente(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", contas=" + contas + "]";
    }

    
}
