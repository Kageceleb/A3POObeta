package logic.Backgrounds;

import logic.Interfaces.Background;
import logic.Skills;

import java.util.ArrayList;

public class Hermit implements Background {
    private String BGName = "Eremita";

    private Skills BGSkills = new Skills();

    public ArrayList<String> BGEquipment = new ArrayList<String>() {
        {
            add("Estojo de Pergaminhos");
            add("Cobertor de Inverno");
            add("Roupas Comuns");
            add("Kit de Herbalismo");
            add("5 po");
        }
    };

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

    public Hermit() {
        BGSkills.medicine = true;
        BGSkills.religion = true;
    }
}
