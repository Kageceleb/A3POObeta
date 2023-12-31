package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class FolkHero implements Background {
    private String BGName = "Herói do Povo";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Ferramentas de Artesão");
            add("Pá");
            add("Pote de Ferro");
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
        return "Você vem de uma posição social humilde, mas seu \ndestino é algo muito maior. O povo de onde veio pode \nlhe ver como um campeão, e é seu destino enfrentar \nos monstros e tiranos que ameaçam o povo comum.";
    }

    @Override
    public String getBGItems() {
        return "Ferramentas de Artesão \nPá \nPote de Ferro \nRoupas Comuns \n10 po";
    }

    @Override
    public String getBGBonuses() {
        return "Lidar com Animais \nSobrevivência";
    }

    @Override
    public Skills getBGSkills() {

        return BGSkills;
    }

    @Override
    public ArrayList<String> getBGEquipment() {
        return BGEquipment;
    }

    public FolkHero() {
        BGSkills.animalHandling = true;
        BGSkills.survival = true;
    }
}
