package Heranca.teste;

import Heranca.Heroi;
import Heranca.Monstro;

public class Jogo{
    public static void main(String[] args) {
        Heroi j1 = new Heroi(10, 20);

        Monstro j2 = new Monstro();
        j2.x = 10;
        j2.y = 21;

        System.out.println(j2.vida);
        j1.atacar(j2);
        System.out.println(j2.vida);
        //System.out.println(j1.x + "\n" + j1.y);

        // j1.andar(Direcao.NORTE);
        // j1.andar(Direcao.NORTE);
        // j1.andar(Direcao.NORTE);
        // j1.andar(Direcao.NORTE);

        // j1.andar(Direcao.LESTE);
        // j1.andar(Direcao.LESTE);
        // j1.andar(Direcao.LESTE);
        // j1.andar(Direcao.LESTE);

        // System.out.println();
        // System.out.println(j1.x + "\n" + j1.y);
    }
}
