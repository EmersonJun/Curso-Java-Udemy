package exercicios;

import javax.swing.JOptionPane;

public class MediaDeNotas {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 3; i++){
            Double n1 = Double.parseDouble(JOptionPane.showInputDialog("insira a nota do aluno "+ i + ":"));

            Double n2 = Double.parseDouble(JOptionPane.showInputDialog("insira a segunda nota do aluno %d:" + i + ":"));
            
            Double media = (n1 + n2) / 2;

                if (media >= 7) {
                    System.out.printf("\naluno %d aprovado", i);
                } else if(media < 7 && media > 4 ){
                    System.out.printf("\naluno %d em recuperacao", i);
                } else {
                    System.out.printf("\naluno %d reprovado", i);
                }
            }

        
    }    
}
