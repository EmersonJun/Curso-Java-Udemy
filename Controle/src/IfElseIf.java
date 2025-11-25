import javax.swing.JOptionPane;

public class IfElseIf {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("insira a nota: ");
        int numero = Integer.parseInt(valor);

        if (numero > 10 || numero < 0) {
            System.out.println("nota invalida");
        } else {
            if (numero >= 9) {
                System.out.println("nota a");
            } else if(numero >= 6){
                System.out.println("aprovado");
            } else {
                System.out.println("reprovado");
            }
        }
    }
}
