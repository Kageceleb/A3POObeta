package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Criminal implements Background {
    private String BGName = "Criminoso";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Ferramentas de Ladrão");
            add("Pé de Cabra");
            add("Roupas Escuras Comuns");
            add("15 po");
        }
    };

    @Override
    public String getBGName() {
        return BGName;
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public Criminal() {
        BGSkills.deception = true;
        BGSkills.stealth = true;
    }
}
