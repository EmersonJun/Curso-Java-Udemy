package exercicios;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class NumeroPrimoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        System.out.println("insira o numero:");
        numero = scanner.nextInt();
        
        
        for(int i = 2; i < numero; i++){
            if (numero % i == 0) {
                contador++;
            }
        }
        switch (contador) {
            case 0:
                System.out.println("primo");
                break;
            default:
                System.out.println("nao e primo");
                break;
        }
    }
}
