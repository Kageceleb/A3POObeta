package gui.Creation.Panels;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Interfaces.Background;
import tools.BGList;

public class BGPanel extends JPanel {
    
    JLabel messageBG = new JLabel("<html><center>Qual o antecedente do seu personagem?</center> <br>  <br><center> O antecedente representa o passado do seu personagem </center> <br> <center> O que ele fazia antes de virar um aventureiro, quais suas experiências de vida. </center></html>");
    
    BGList bgList = new BGList();
    ArrayList<Background> bgs = bgList.getBGList();
    int chosenBG = 0;
    
    public BGPanel(){
        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 150));
        add(messageBG);

        for(Background background:bgs){
            JButton bgButton= new JButton(background.getBGName());
            bgButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionListener e){
                    chosenBG = background.get"oque?";//index da lista?
                }
            });
            add(bgButton);
        }



    }




    // public int getBGNumber() {

    //     setLayout(new FlowLayout(FlowLayout.CENTER, 200, 150));
    //     add(messageBG);
    //     return 0;
    // }
}
