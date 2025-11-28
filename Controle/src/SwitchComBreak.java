import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira a nota do aluno: ");
        String nota = scanner.nextLine();
        String conceito = "";
        Double n1 = Double.parseDouble(nota.replaceAll(",", "."));

        switch (n1.intValue()) {
            case 10:
                conceito = "a";
                break;
            case 9:
                conceito = "a";
                break;            
            case 8:
                conceito = "b";
                break;        
        
            default:
                System.out.println("nota invalida");
                break;
        }
        System.out.printf("o conceito da nota %.2f é: %s",n1, conceito);
    }
}
