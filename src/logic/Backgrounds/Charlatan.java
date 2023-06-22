package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Charlatan implements Background {
    private String BGName = "Charlatão";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Roupas Finas");
            add("Kit de Disfarce");
            add("Ferramentas de Trapaça");
            add("Garrafas de Líquidos Coloridos");
            add("15 po");
        }
    };

    @Override
    public String getBGName() {
        return BGName;
    }

    @Override
    public String getBGDescription() {
        return "Você sempre teve um jeito com pessoas. Você sabe o \nque os faz funcionar, e com um pouco de cuidado pode \nos ler como um livro. Você sabe o que as pessoas \nquerem e dá isso a elas, ou ao menos promete.";
    }

    @Override
    public String getBGItems() {
        return "Roupas Finas \nKit de Disfarce \nFerramentas de Trapaça \nGarrafas de Líquidos Coloridos \n15 po";
    }

    @Override
    public String getBGBonuses() {
        return "Enganação \nPrestidigitação";
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public Charlatan() {
        BGSkills.deception = true;
        BGSkills.sleighofHand = true;
    }
}
