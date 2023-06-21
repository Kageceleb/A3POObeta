
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



        /*Scanner sc = new Scanner(System.in);
        int menu, id;
        String name;
        Character newChar;

        // Criar um novo personagem
        do {
            System.out.println("1 - Cadastrar Personagem");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                CharacterRepository.create();
                break;
                case 3:
                System.out.println("do nothing");;
                break;
            }

        } while (menu != 7);*/

        //CharacterCreator creator = new CharacterCreator();

        //int[] attributes = new int[6];

        //attributes = creator.assignAttributes();

        // Character teste para visualizar ficha
        LogicCharacter testChar = new LogicCharacter(0,"Goliath", "Jonas", 4, 15, 14, 13, 12, 10, 8, 5, 2, 4, 7);

        String sql = "INSERT INTO sheetmain (name) VALUES 'joão' ";

        //System.out.println(testChar);

        CharacterRepository porra = new CharacterRepository();

        int yes = porra.create(testChar);

        System.out.println(yes);

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