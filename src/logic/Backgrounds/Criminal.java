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
    public String getBGDescription() {
        return "Você é um criminoso experiente, com uma história em \nquebrar a lei. Você é muito mais próximo do que a \nmaioria das pessoas do mundo de assassinato, roubo e \nviolência, e sobreviveu até esse ponto ao ignorar as \nregras e regulamentos da sociedade.";
    }

    @Override
    public String getBGItems() {
        return "Ferramentas de Ladrão \nPé de Cabra \nRoupas Escuras Comuns \n15 po";
    }

    @Override
    public String getBGBonuses() {
        return "Enganação \nFurtividade";
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
