import javax.swing.JOptionPane;

public class ElseIf {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("insira o valor do numero: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
