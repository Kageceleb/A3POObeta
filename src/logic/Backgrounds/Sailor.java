package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Sailor implements Background {
    private String BGName = "Marinheiro";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Clava");
            add("15m Corda de Seda");
            add("Amuleto da sorte");
            add("Trajes Comuns");
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

    public Sailor() {
        BGSkills.athletics = true;
        BGSkills.perception = true;
    }
}
