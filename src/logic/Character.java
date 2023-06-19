package logic;

import logic.Interfaces.*;
import logic.Races.*;

import java.util.ArrayList;

import logic.Classes.*;

public class Character {
    
    private String name;
    private String player;
    private String alignment;
    
    private int strMain;
    private int dexMain;
    private int conMain;
    private int intMain;
    private int wisMain;
    private int chaMain;

    private int level;

    private Race race;
    private Classy classy;
    private Background background;

    private ArrayList<String> equipment;
    private ArrayList<String> magics;

    public String getName() {
    return name;
    }

    public String getPlayer() {
        return player;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getStrMain() {
        return strMain;
    }

    public int getDexMain() {
        return dexMain;
    }

    public int getConMain() {
        return conMain;
    }

    public int getIntMain() {
        return intMain;
    }

    public int getWisMain() {
        return wisMain;
    }

    public int getChaMain() {
        return chaMain;
    }

    public int getLevel() {
        return level;
    }

    

    public Background getBackground() {
        return background;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public ArrayList<String> getMagics() {
        return magics;
    }

    public Character(String name, String player, String alignment, int strMain, int dexMain, int conMain, int intMain, int wisMain, int chaMain, int level, int race, int classy, int background){
        
        this.name = name;
        this.player = player;
        this.alignment = alignment;

        this.level = level;

        switch(race) {
            case 1:
                this.race = new Human();
            break;
            case 2:
                this.race = new Dwarf();
            break;
            case 3:
                this.race = new Elf();
            break;
        }

        switch(classy) {
            case 1:
                this.classy = new Warrior(level);
            break;
            case 2:
                this.classy = new Thief(level);
            break;
            case 3:
                this.classy = new Mage(level);
            break;
            case 4:
                this.classy = new Priest(level);
            break;
        }

        switch(background) {
            case 1:

            break;
            case 2:

            break;
            case 3:

            break;
            case 4:

            break;
            case 5:

            break;
            case 6:

            break;
            case 7:

            break;
            case 8:

            break;
            case 9:

            break;
            case 10:

            break;
            case 11:

            break;
            case 12:

            break;
            case 13:

            break;
        }

        //Pega os valores do banco de dados e soma aos modificadores da raça e classe

        this.strMain = strMain + this.race.getRaceStr() + this.classy.getClassStr();
        this.dexMain = dexMain + this.race.getRaceDex() + this.classy.getClassDex();
        this.conMain = conMain + this.race.getRaceCon() + this.classy.getClassCon();
        this.intMain = intMain + this.race.getRaceInt() + this.classy.getClassInt();
        this.wisMain = wisMain + this.race.getRaceWis() + this.classy.getClassWis();
        this.chaMain = chaMain + this.race.getRaceCha() + this.classy.getClassCha();

        //Loops para popular o inventário do personagens com os itens herdados da classe e do background

        equipment = new ArrayList<String>();

        for (String classEquip : this.classy.getClassEquipment()) {
            this.equipment.add(classEquip);
        }

        for (String BGEquip : this.background.getBGEquipment()) {
            this.equipment.add(BGEquip);
        }

        //Loop para popular as magias do personagem

        magics = new ArrayList<String>();

        for (String magic : this.classy.getClassMagics()) {
            this.magics.add(magic);
        }
    }
    
}
