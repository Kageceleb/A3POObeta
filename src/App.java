
import tools.CharacterCreator;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Criar um novo personagem

        CharacterCreator creator = new CharacterCreator();

        int[] attributes = new int[6];

        attributes = creator.assignAttributes();

        //Teste para o retorno dos valores
        System.out.println("Atributos:");
        System.out.println("Força: " + attributes[0]);
        System.out.println("Destreza: " + attributes[1]);
        System.out.println("Constituição: " + attributes[2]);
        System.out.println("Inteligência: " + attributes[3]);
        System.out.println("Sabedoria: " + attributes[4]);
        System.out.println("Carisma: " + attributes[5]);

    }
}
