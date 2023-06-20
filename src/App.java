
import logic.Character;
import tools.CharacterCreator;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Criar um novo personagem

        CharacterCreator creator = new CharacterCreator();

        int[] attributes = new int[6];

        //attributes = creator.assignAttributes();

        //Character teste para visualizar ficha
        Character testChar = new Character("Goliath","Jonas",4,15,14,13,12,10,8,5,2,4,7);

        System.out.println(testChar);


    }
}
