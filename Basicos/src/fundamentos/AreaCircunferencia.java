package fundamentos;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;

public class AreaCircunferencia {
    public static void main(String[] args) {
        String nome;
        int raio = 3;
        final double pi = 3.14;

        double area = pi * raio * raio;
        System.out.println("area dacircunferencia:" + area);
        Date d = new Date();
        System.out.println(d);

        
        /*
         * JButton b = new JButton();
            System.out.println(b);
         */

         System.out.println("seu nome: ");
         Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

         System.out.println(nome);
         
    }   
}
 