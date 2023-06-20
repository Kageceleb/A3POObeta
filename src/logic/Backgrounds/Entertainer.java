package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Entertainer implements Background {
    private String BGName = "Artista";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Instrumento Musical");
            add("Kit de Disfarce");
            add("Presente de um admirador");
            add("Traje");
            add("15 po");
        }
    };

    @Override
    public String getBGName() {
        return BGName;
    }

    @Override
    public String getBGDescription() {
        return "Descrição teste sumermega descricao a descricao das descricoes bem descrita e descrituda";
    }

    @Override
    public String getBGItems() {
        return "Itens teste \n "
        +"Item 2 \n Item 3 \n Tem 4";
    }

    @Override
    public String getBGBonuses() {
        return "Bonus teste lalalalal lala alalala lalala lal lalalala";
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public Entertainer() {
        BGSkills.acrobatics = true;
        BGSkills.performance = true;
    }
}
