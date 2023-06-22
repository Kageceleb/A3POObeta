package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Entertainer implements Background {
    private String BGName = "Artista";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Instrumento Musical");
            add("Kit de Disfarce");
            add("Presente de um admirador");
            add("Traje");
            add("15 po");
        }
    };

    @Override
    public String getBGName() {
        return BGName;
    }

    @Override
    public String getBGDescription() {
        return "Você é seu melhor na frente de um público. Você sabe \ncomo prendê-los, entretê-los, e mesmo inspirá-los. \nSua música pode instigar corações, sua dança capturar \nmentes. Seja qual for a técnica, sua arte é sua vida.";
    }

    @Override
    public String getBGItems() {
        return "Instrumento Musical \nKit de Disfarce \nPresente de um admirador \nTraje \n15 po";
    }

    @Override
    public String getBGBonuses() {
        return "Acrobacia \nAtuação";
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public Entertainer() {
        BGSkills.acrobatics = true;
        BGSkills.performance = true;
    }
}
