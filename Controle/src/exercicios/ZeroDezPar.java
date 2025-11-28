package exercicios;

import java.util.Scanner;

public class ZeroDezPar {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o numero");
        numero = scanner.nextInt();

        if (numero <= 10 || numero >= 0) {
            if (numero % 2 == 0) {
                System.out.printf("o numero %d é par", numero);
            } else {
                System.out.printf("o numero %d é impar", numero);
            }
        }
        scanner.close();
    }
}
