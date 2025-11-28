package exercicios;

import java.util.Scanner;

public class Positivos {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (numero >= 0){
        System.out.println("insira um numero inteiro para sair:");
        numero = scanner.nextInt();

        if (numero >= 0) {
            soma += numero;
        }
        }
        System.out.println(soma);
        scanner.close();
    }
}
