package Exercicios;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o n1: ");
        String n1 = scanner.nextLine().replace(",", ".");
        Double num1 = Double.parseDouble(n1); 

        System.out.println("insira o n2: ");
        String n2 = scanner.nextLine().replace(",", ".");
        Double num2 = Double.parseDouble(n2); 

        System.out.println("insira o n3: ");
        String n3 = scanner.nextLine().replace(",", ".");
        Double num3 = Double.parseDouble(n3); 

        Double Delta = Math.pow(num2, 2) - 4 * num1*num3; 

        Double x1 = (-(num2) + Math.sqrt(Delta)) / 2 * num1;
        Double x2 = (-(num2) - Math.sqrt(Delta)) / 2 * num1;  

        System.out.printf("os resultados são: S ={%.2f , %.2f}", x1, x2);
    }
}
