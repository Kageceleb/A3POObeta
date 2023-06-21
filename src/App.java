
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

        CharacterRepository cr = new CharacterRepository();

        LogicCharacter testChar = new LogicCharacter(0,"Goliath", "Jonas", 4, 15, 14, 13, 12, 10, 8, 5, 2, 4, 7);
        
        for (LogicCharacter c : cr.list()) {
            System.out.println(c.getId() + "  -  " + c.getName() + " Jogador: " + c.getPlayer());
        }
        //int b = cr.update(1, testChar);

        // SwingUtilities.invokeLater(new Runnable() {
        //     public void run() {
        //         JFrame frame = new JFrame("Background Selection");
        //         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //         frame.getContentPane().add(new BackgroundSelectionPanel());
        //         frame.setSize(800, 600);
        //         frame.setVisible(true);
        //     }
        // });
        //, player, strMain, dexMain, conMain, intMain, wisMain, chaMain, lvl, race, classy, aligment, backGround
        
//         ,'" + testChar.getPlayer() + "' ,'"
//  + testChar.getStrMain() + "','" + testChar.getDexMain() + "','"
//  + testChar.getConMain() + "','" + testChar.getIntMain() + "','"
//  + testChar.getWisMain() + "','" + testChar.getChaMain() + "','"
//  + testChar.getLevel() + "','" + testChar.getRaceNumber() + "' ,'"
//  + testChar.getClassNumber() + "' ,'" + testChar.getBGNumber() + "'
    }
}