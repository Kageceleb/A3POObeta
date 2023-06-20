package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class GuildArtisan implements Background {
    private String BGName = "Artesão de Guilda";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Ferramentas de Artesão");
            add("Carta de Apresentação da Guilda");
            add("Roupas de Viajante");
            add("15 po");
        }
    };

    @Override
    public String getBGName() {
        return BGName;
    }

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
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public GuildArtisan() {
        BGSkills.insight = true;
        BGSkills.persuasion = true;
    }
}
