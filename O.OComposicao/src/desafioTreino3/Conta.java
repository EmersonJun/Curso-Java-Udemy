package desafioTreino3;

public class Conta {
    int numero;
    double saldo;
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }
    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }
    public boolean tranferir(double valor, Conta destino){
        destino.depositar(valor);
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
    }
}
