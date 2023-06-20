package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Soldier implements Background {
    private String BGName = "Soldado";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Insignia de Patente");
            add("Fetiche de um inimigo");
            add("Conjuto de dados de osso");
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

    public Soldier() {
        BGSkills.athletics = true;
        BGSkills.intimidation = true;
    }
}
