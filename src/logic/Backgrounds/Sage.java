package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Sage implements Background {
    private String BGName = "Sábio";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Vidro de Tinta Escura");
            add("Pena");
            add("Faca Pequena");
            add("Carta de um falecido colega");
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
        return "Você passou anos aprendendo sobre o multiverso. \nVocê fuçou escritos, estudou pergaminhos e ouviu os \ngrandes especialistas no assunto que lhe interessa.";
    }

    @Override
    public String getBGItems() {
        return "Vidro de Tinta Escura \nPena \nFaca Pequena \nCarta de um falecido colega \nRoupas Comuns \n10 po";
    }

    @Override
    public String getBGBonuses() {
        return "História \nArcanismo";
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public Sage() {
        BGSkills.history = true;
        BGSkills.arcana = true;
    }
}
