package repository;

public class Character extends Entity {
    public Character(
            int id,
            String name,
            String player,
            int alignment,
            int strMain,
            int dexMain,
            int conMain,
            int intMain,
            int wisMain,
            int chaMain,
            int lvl,
            int race,
            int classy,
            int background) {
        super(id);
        this.name = name;
        this.player = player;
        this.alignment = alignment;
        this.strMain = strMain;
        this.dexMain = dexMain;
        this.conMain = conMain;
        this.intMain = intMain;
        this.wisMain = wisMain;
        this.chaMain = chaMain;
        this.lvl = lvl;
        this.race = race;
        this.classy = classy;
        this.background = background;
    }

    public String name;
    public String player;
    public int alignment;
    public int strMain;
    public int dexMain;
    public int conMain;
    public int intMain;
    public int wisMain;
    public int chaMain;
    public int lvl;
    public int race;
    public int classy;
    public int background;
    
    public String getName() {
        return name;
    }
    public String getPlayer() {
        return player;
    }
    public int getAlignment() {
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
        return lvl;
    }
    public int getRace() {
        return race;
    }
    public int getClassy() {
        return classy;
    }
    public int getBackground() {
        return background;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public void setAlignment(int alignment) {
        this.alignment = alignment;
    }
    public void setStrMain(int strMain) {
        this.strMain = strMain;
    }
    public void setDexMain(int dexMain) {
        this.dexMain = dexMain;
    }
    public void setConMain(int conMain) {
        this.conMain = conMain;
    }
    public void setIntMain(int intMain) {
        this.intMain = intMain;
    }
    public void setWisMain(int wisMain) {
        this.wisMain = wisMain;
    }
    public void setChaMain(int chaMain) {
        this.chaMain = chaMain;
    }
    public void setLevel(int level) {
        this.lvl = level;
    }
    public void setRace(int race) {
        this.race = race;
    }
    public void setClassy(int classy) {
        this.classy = classy;
    }
    public void setBackground(int background) {
        this.background = background;
    }
}