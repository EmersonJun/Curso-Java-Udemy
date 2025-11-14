import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o primeiro salario:");
        String s1 = scanner.nextLine().replace(",", ".");

        System.out.println("insira o segundo salario:");
        String s2 = scanner.nextLine().replace(",", ".");

        System.out.println("insira o terceiro salario:");
        String s3 = scanner.nextLine().replace(",", ".");

        Double n1 = Double.parseDouble(s1);
        Double n2 = Double.parseDouble(s2);
        Double n3 = Double.parseDouble(s3);

        double media = (n1 + n2 + n3)/3;
        System.out.println("media dos salarios: " +media);
    }
}
