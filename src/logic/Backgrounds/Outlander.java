package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Outlander implements Background {
    private String BGName = "Forasteiro";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Bordão");
            add("Armadilha de Caça");
            add("Fetiche Animal");
            add("Roupas de Viajante");
            add("10 po");
        }
    };

    @Override
    public String getBGName() {
        return BGName;
    }

    @Override
    public String getBGDescription() {
        return "Você cresceu no ermo, longe da civilização e os \nconfortos das cidades e tecnologia.";
    }

    @Override
    public String getBGItems() {
        return "Bordão \nArmadilha de Caça \nFetiche Animal \nRoupas de Viajante \n10 po";
    }

    @Override
    public String getBGBonuses() {
        return "Atletismo \nSobrevivência";
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public Outlander() {
        BGSkills.athletics = true;
        BGSkills.survival = true;
    }
}
