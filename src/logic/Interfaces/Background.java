package logic.Interfaces;

import java.util.ArrayList;

import logic.Skills;

public interface Background {
    
    public String getBGName();

    public Skills getBGSkills();

    public ArrayList<String> getBGEquipment();

    public String getBGDescription();

    public String getBGItems();

    public String getBGBonuses();

}
