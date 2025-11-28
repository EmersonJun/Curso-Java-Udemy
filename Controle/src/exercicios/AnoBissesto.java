package exercicios;

import javax.swing.JOptionPane;

public class AnoBissesto {
    public static void main(String[] args) {
        String ano = JOptionPane.showInputDialog("insira o seu ano");
        Double a = Double.parseDouble(ano);

        if(a % 4 == 0){
            System.out.printf("o ano %.2f é bissexto",a);
        } else {
            System.out.println("o ano nao é bissexto");
        }

    }
}
