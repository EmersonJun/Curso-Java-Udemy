package exercicios;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        int numero = 0;
        int maior =0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("insira um numero");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }    
        System.out.println("o maior numero é: "+maior);
    }
}
