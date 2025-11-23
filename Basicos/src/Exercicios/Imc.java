package Exercicios;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o seu peso:");
        String peso = scanner.nextLine().replace(",", ".");; 

        System.out.println("insira a sua altura:");
        String altura = scanner.nextLine().replace(",", ".");; 

        Double pes = Double.parseDouble(peso);
        Double alt = Double.parseDouble(altura);
        Double imc = pes / alt;

        System.out.printf("seu imc é: %.2f tendo o peso de %.2f e altura %.2f", imc, pes, alt);
    }
}
