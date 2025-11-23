package Exercicios;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("coloque a temperatura em fah: ");
        double tempF = scanner.nextDouble();
        double tempC = (tempF - 32) * 5/9;
        System.out.printf("\n a temperatura %.2fF em C é: %.2fC", tempF, tempC);
    }
}
