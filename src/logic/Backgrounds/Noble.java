package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Noble implements Background {
    private String BGName = "Nobre";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Trajes Finos");
            add("Anel de Sinete");
            add("Pergaminho de Linhagem");
            add("25 po");
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

    public Noble() {
        BGSkills.history = true;
        BGSkills.persuasion = true;
    }
}
