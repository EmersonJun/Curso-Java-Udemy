package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Adivinhacao {
    public static void main(String[] args) {
        int numero = 77;

        System.out.println("-----adivinhe o numero-----");
        for(int i = 10; i > 0; i--){
            int n = Integer.parseInt(JOptionPane.showInputDialog("\ninsira o numero:"));
            if (n == numero) {
                System.out.println("voce acertou");
                break;
            } else if(n > numero){
                System.out.printf("\nvoce errou, tente novamente (o numero é menor): \nTentativas restantes %d", i);
            } else if(n < numero){
                System.out.printf("\nvoce errou, tente novamente (o numero é maior): \nTentativas restantes %d", i);
            }
        }
    }
}
