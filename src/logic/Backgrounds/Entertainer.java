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
