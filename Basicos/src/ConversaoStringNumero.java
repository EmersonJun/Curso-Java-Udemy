import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("digite o segundo numero");

        Double n1 = Double.parseDouble(valor1);
        Double n2 = Double.parseDouble(valor2);
        double soma= n1 + n2;
        System.out.println(soma);
    }
}
