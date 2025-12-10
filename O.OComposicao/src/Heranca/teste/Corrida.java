package Heranca.teste;

import desafio2.Civic;
import desafio2.Ferrari;

public class Corrida {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        Civic b1 = new Civic();

        System.out.println(b1.velocidade);
        System.out.println(f1.velocidade);

        b1.acelerar();
        f1.acelerar();
        f1.ligarTurbo();
        f1.acelerar();
        f1.ligarAr();
        f1.acelerar();

        System.out.println(f1.velocidadeDoAr());
        System.out.println();
        System.out.println(b1.velocidade);
        System.out.println(f1.velocidade);

        b1.frear();
        f1.frear();

        System.out.println();
        System.out.println(b1.velocidade);
        System.out.println(f1.velocidade);
    } 
}
