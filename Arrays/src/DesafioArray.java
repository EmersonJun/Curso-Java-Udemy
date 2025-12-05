import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("quantas notas voce quer informar");
        int ArrayDeNotas = scanner.nextInt();

        double[] notas = new double[ArrayDeNotas]; 

        for(int i = 0;i < notas.length; i++){
            System.out.println("digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double d : notas) {
            soma += d;
        }
        System.out.println(soma / notas.length);
        scanner.close();
    }
}
