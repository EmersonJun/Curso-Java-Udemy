package fundamentos;
import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
    String n1 = JOptionPane.showInputDialog("insira o numero 1:");
    String formula = JOptionPane.showInputDialog("insira a formula( * / + - %):");
    String n2 = JOptionPane.showInputDialog("insira o numero 2:");
    
    double v1 = Double.parseDouble(n1);
    double v2 = Double.parseDouble(n2);
    double resultado = "+".equals(formula) ? v1 + v2 : 0;
     resultado = "-".equals(formula) ? v1 - v2 : resultado;
     resultado = "*".equals(formula) ? v1 * v2 : resultado;
     resultado = "/".equals(formula) ? v1 / v2 : resultado;
     resultado = "%".equals(formula) ? v1 % v2 : resultado;
    System.out.printf("%.2f %s %.2f = %.2f", v1, formula, v2, resultado);
    }
}
