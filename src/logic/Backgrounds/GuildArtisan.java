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
        return "Você é membro de uma guilda de artesãos, hábeis em \num campo particular e associado a outros. Você \naprendeu suas perícias como o aprendiz de um mestre \nou junto de uma guilda, até se tornar um mestre você \ntambém.";
    }

    @Override
    public String getBGItems() {
        return "Ferramentas de Artesão \nCarta de Apresentação da Guilda \nRoupas de Viajante \n15 po";
    }

    @Override
    public String getBGBonuses() {
        return "Intuição \nPersuasão";
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
