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
    public String getBGDescription() {
        return "Você cresceu nas ruas sozinho. Você não tinha \nninguém para cuidar de você e teve que aprender a se \nvirar. Contra todas as apostas você sobreviveu, e o \nfez através de esperteza e força.";
    }

    @Override
    public String getBGItems() {
        return "Faca Pequena \nMapa da Cidade \nRato de estimação \nRecordação dos pais \nRoupas Comuns \n10 po";
    }

    @Override
    public String getBGBonuses() {
        return "Furtividade \nPrestidigitação";
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
