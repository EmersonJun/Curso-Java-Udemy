package Exercicios;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o n1: ");
        String n1 = scanner.nextLine().replace("," ,".");

        Double num = Double.parseDouble(n1);

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.printf("o numero %.2f é\n Ao cubo: %.2f\n Ao quadrado: %.2f", num, cubo, quadrado);
    }
}
