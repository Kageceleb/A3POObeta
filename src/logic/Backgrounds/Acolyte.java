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
        return "Você passou sua vida em serviço de um templo. \nVocê age como um intermediário entre o reino do \nsagrado e do mundo mortal, fazendo ritos sagrados e \noferecendo sacrifícios para guiar os fieis à presença \ndo divino.";
    }

    @Override
    public String getBGItems() {
        return "Símbolo Sagrado \nLivro de Preces \nVareta de Incenso x5 \nRoupas Comuns \n15 po";
    }

    @Override
    public String getBGBonuses() {
        return "Intuição \nReligião";
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
