package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Urchin implements Background {
    private String BGName = "Órfão";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Faca Pequena");
            add("Mapa da Cidade");
            add("Rato de estimação");
            add("Recordação dos pais");
            add("Roupas Comuns");
            add("10 po");
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

    public Urchin() {
        BGSkills.stealth = true;
        BGSkills.sleighofHand = true;
    }
}
