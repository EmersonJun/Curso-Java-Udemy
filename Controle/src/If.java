import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a media");
        double media = scanner.nextDouble();

        if(media >= 6){
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
        scanner.close();
    }
}
