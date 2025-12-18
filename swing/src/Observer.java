import java.util.concurrent.Flow;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop.Action;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observer {
    public static void main(String[] args) {
        JFrame janela = new JFrame("observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); //nul centralisa na tela do computadoe


        JButton botao = new JButton("clicar");
        janela.add(botao);

        // botao.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("evento ocorreu");
        //     }
        // });

        botao.addActionListener(e -> {
            System.out.println("evento ocorreu");
        });

        //janela.addFocusListener(null);
        
        
        janela.setVisible(true);
    }
}
