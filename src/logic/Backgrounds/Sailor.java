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
    public String getBGDescription() {
        return "Você navegou por anos. Nesse tempo você encarou \ntempestades poderosas e monstros tentando afundar \nseu navio. Você ama a linha distante do horizonte, \nmas chegou a hora de tentar algo novo.";
    }

    @Override
    public String getBGItems() {
        return "Clava \n15m Corda de Seda \nAmuleto da sorte \nTrajes Comuns \n10 po";
    }

    @Override
    public String getBGBonuses() {
        return "Atletismo \nPercepção";
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
