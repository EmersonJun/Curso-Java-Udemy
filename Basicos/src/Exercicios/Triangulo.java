package Exercicios;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira a base do triangulo: ");
        String b = scanner.nextLine().replace(",", ".");
        Double base = Double.parseDouble(b);

        System.out.println("insira a altura do triangulo: ");
        String a = scanner.nextLine().replace(",", ".");
        Double altura = Double.parseDouble(a);

        double area = (base * altura) /2;

        System.out.println("a area do triangulo é: " + area);
    }
}
