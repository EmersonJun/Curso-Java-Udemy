package desafio2;

public class Carro {
    public int velocidade = 0;
    final int velocidadeMaxima;
    private int delta = 5;
    

    protected Carro(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidade + delta > velocidadeMaxima) {
            velocidade = velocidadeMaxima;
        }
        velocidade += getDelta();
    }

    public void frear(){
        if (velocidade >= getDelta()) {
            velocidade -= getDelta();
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

}
