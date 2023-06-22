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
    public String getBGDescription() {
        return "Guerra está em sua vida desde quando você consegue \nse lembrar. Você treinou de jovem em como usar armas \ne armaduras, aprendendo as perícias básicas da \nsobrevivência, incluindo como ficar vivo no campo de \nbatalha, seja como soldado, mercenário ou guarda.";
    }

    @Override
    public String getBGItems() {
        return "Insignia de Patente \nFetiche de um inimigo \nConjuto de dados de osso \nRoupas Comuns \n10 po";
    }

    @Override
    public String getBGBonuses() {
        return "Atletismo \nIntimidação";
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
