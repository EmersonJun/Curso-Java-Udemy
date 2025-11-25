import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String valor = "por favor";

        do {
            System.out.println("quer sair\nquais sao as palavras magicas:");
            valor = scanner.nextLine();
        } while (!valor.equalsIgnoreCase("por favor"));
            System.out.println("obrigado");
        
        scanner.close();
    }
}
