package Heranca;

public class Jogador {
    public int vida = 100;
    public int dano = 10;
    public int x;
    public int y;

    // Jogador(){
    //     this(0, 0);
    // }

    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltay == 1) {
            oponente.vida -= dano;
            return true;
        } else if (deltaX == 1 && deltay == 0) {
            oponente.vida -= dano;
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(Direcao direcao){
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        
            default:
                break;
        }
        return true;
    }
}
