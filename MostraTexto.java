import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MostraTexto extends JFrame implements ActionListener {
   private JFrame frame = new JFrame("Mostrador de Texto");
   private JPanel panel;
   private JLabel labelTexto;
   private JTextField texto;
   private JButton botaoMostrar;
   private JButton botaoLimpar;
   private JButton botaoSair;
   
   public MostraTexto() {
      //Painel
      panel = new JPanel(new FlowLayout());
      labelTexto = new JLabel("Texto");
      panel.add(labelTexto);
      texto = new JTextField(10);
      panel.add(texto);
      botaoMostrar = new JButton("Mostrar");
      botaoMostrar.addActionListener(this);
      panel.add(botaoMostrar);
      botaoLimpar = new JButton("Limpar");
      botaoLimpar.addActionListener(this);
      panel.add(botaoLimpar);
      botaoSair = new JButton("Sair");
      botaoSair.addActionListener(this);
      panel.add(botaoSair);
      //Montando a tela
      frame.add(panel);
      //Configuracao da tela
      frame.setSize(400, 75);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == botaoMostrar) {
         String textoString = texto.getText();
         JOptionPane.showMessageDialog(null, textoString);
      }
      if (e.getSource() == botaoLimpar) {
         texto.setText("");
      }
      if (e.getSource() == botaoSair) {
         System.exit(0);
      }
   }
}