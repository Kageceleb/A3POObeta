
import java.util.Scanner;

import logic.LogicCharacter;
import repository.Character;
import repository.CharacterRepository;
import tools.CharacterCreator;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu, id;
        String name;
        Character newChar;

        // Criar um novo personagem
        do {
            System.out.println("1 - Cadastrar Personagem");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                CharacterRepository.create(id, name);
                break;

        } while (menu != 7);

        CharacterCreator creator = new CharacterCreator();

        int[] attributes = new int[6];

        // attributes = creator.assignAttributes();

        // Character teste para visualizar ficha
        // Character testChar = new Character("Goliath", "Jonas", 4, 15, 14, 13, 12, 10, 8, 5, 2, 4, 7);

        // System.out.println(testChar);

    }
}
}
