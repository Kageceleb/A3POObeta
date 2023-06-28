package gui.Creation.Panels;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BeginPanel extends JPanel {

    JLabel message1 = new JLabel("<html><center>Vamos começar a sua jornada!</center> <br>  <br><center> À seguir você deverá informar os dados básicos de seu personagem, </center> <br> <center> portanto antes converse com seu mestre a respeito das regras de criação na campanha! </center></html>");
    
    public BeginPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 150));
        add(message1);
      
        

    }

}
