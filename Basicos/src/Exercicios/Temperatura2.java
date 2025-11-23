package Exercicios;

import java.util.Scanner;

public class Temperatura2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("coloque a temperatura em C: ");
        double tempC = scanner.nextDouble();
        double tempF = tempC * 1.8 + 32;
        System.out.printf("\n a temperatura %.2fc em C é: %.2ff", tempC, tempF);
    }
}
