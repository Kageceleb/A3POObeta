package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Acolyte implements Background {

    private String BGName = "Acólito";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Símbolo Sagrado");
            add("Livro de Preces");
            add("Vareta de Incenso x5");
            add("Roupas Comuns");
            add("15 po");
        }
    };

    @Override
    public String getBGDescription() {
        return "Descrição teste";
    }

    @Override
    public String getBGItems() {
        return "Itens teste";
    }

    @Override
    public String getBGBonuses() {
        return "Bonus teste";
    }

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

    public Acolyte() {
        BGSkills.insight = true;
        BGSkills.religion = true;
    }
}
