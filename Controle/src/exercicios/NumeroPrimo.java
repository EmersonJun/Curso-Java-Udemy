package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        // int n = Integer.parseInt(JOptionPane.showInputDialog("insira um numero:"));

        // if (n <= 1) {
        //     System.out.println("nao é primo");
        // }
        //  for(int i = 2; i * i <= n;i++){
        //         if (n % i == 0) {
        //             System.out.println("nao é primo");
        //         }
        //         if (condition) {
                    
        //         }
        //     }      
        //     System.out.println("é primo");


        int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		scanner.close();

    }
}
