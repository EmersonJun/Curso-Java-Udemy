import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sair = "";
        while (!sair.equals("sair")) {
            System.out.println("digite sair para sair: ");
            sair = scanner.nextLine();
        }
    }
}
