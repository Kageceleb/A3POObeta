
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gui.BackgroundSelectionPanel;
import logic.LogicCharacter;
import repository.CharacterRepository;
import repository.DBConnectionSingleton;
import tools.CharacterCreator;

public class App {
    public static void main(String[] args) throws Exception {

        // CharacterRepository cr = new CharacterRepository();

        // LogicCharacter testChar = new LogicCharacter(0,"Goliath", "Jonas", 4, 15, 14, 13, 12, 10, 8, 5, 2, 4, 7);
        
        // for (LogicCharacter c : cr.list()) {
        //     System.out.println(c.getId() + "  -  " + c.getName() + " Jogador: " + c.getPlayer());
        // }
        //int b = cr.update(1, testChar);

        CharacterCreator cc = new CharacterCreator();
        
        

    }
}