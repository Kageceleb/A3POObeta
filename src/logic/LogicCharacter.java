package logic;

import logic.Backgrounds.*;
import logic.Interfaces.*;
import logic.Races.*;

import repository.*;

import java.util.ArrayList;

import logic.Classes.*;

public class LogicCharacter extends Entity {
    
    private String name;
    private String player;
    private int alignment;

    private int raceNumber;
    private int classNumber;
    private int BGNumber;
    
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

    //Getters de informações básicas

    public int getId() { return id; }
    public String getName() {
        return name;
    }

    public String getPlayer() {
        return player;
    }

    public int getAlignmentNumber() {
        return alignment;
    }
    public String getAlignment() {

        switch(alignment){
            case 1:
                return "Leal Bom";
            case 2:
                return "Caótico Bom";
            case 3:
                return "Neutro Bom";
            case 4:
                return "Leal Neutro";
            case 5:
                return "Neutro";
            case 6:
                return "Caótico Neutro";
            case 7:
                return "Leal Mau";
            case 8:
                return "Caótico Mau";
            case 9:
                return "Neutro Mau";
            default:
                return "";
        }
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHP() {
        return (this.classy.getClassHP() + (this.getConMod()*this.level));
    }

    public int getProficiency() {

        if(getLevel()>=17) {
            return 6;
        } else if (getLevel()>=13) {
            return 5;
        } else if (getLevel()>=9) {
            return 4;
        } else if (getLevel()>=5) {
            return 3;
        } else {
            return 2;
        }

    }


    //Getter de Atributos
        //Atributos Mains

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

        //Atributos Mods

    public int getStrMod() {
        return ((strMain-10)/2);
    }

    public int getDexMod() {
        return ((dexMain-10)/2);
    }

    public int getConMod() {
        return ((conMain-10)/2);
    }

    public int getIntMod() {
        return ((intMain-10)/2);
    }

    public int getWisMod() {
        return ((wisMain-10)/2);
    }

    public int getChaMod() {
        return ((chaMain-10)/2);
    }

    //Getters Skills

    public int getAthletics(){
        if(this.background.getBGSkills().athletics){
            return (this.getStrMod()+this.getProficiency());
        } else {
            return this.getStrMod();
        }
    }
    public int getAcrobatics(){
        if(this.background.getBGSkills().acrobatics){
            return (this.getDexMod()+this.getProficiency());
        } else {
            return this.getDexMod();
        }
    }
    public int getSleighofHand(){
        if(this.background.getBGSkills().sleighofHand){
            return (this.getDexMod()+this.getProficiency());
        } else {
            return this.getDexMod();
        }
    }
    public int getStealth(){
        if(this.background.getBGSkills().stealth){
            return (this.getDexMod()+this.getProficiency());
        } else {
            return this.getDexMod();
        }
    }
    public int getArcana(){
        if(this.background.getBGSkills().arcana){
            return (this.getIntMod()+this.getProficiency());
        } else {
            return this.getIntMod();
        }
    }
    public int getHistory(){
        if(this.background.getBGSkills().history){
            return (this.getIntMod()+this.getProficiency());
        } else {
            return this.getIntMod();
        }
    }
    public int getInvestigation(){
        if(this.background.getBGSkills().investigation){
            return (this.getIntMod()+this.getProficiency());
        } else {
            return this.getIntMod();
        }
    }
    public int getNature(){
        if(this.background.getBGSkills().nature){
            return (this.getIntMod()+this.getProficiency());
        } else {
            return this.getIntMod();
        }
    }
    public int getReligion(){
        if(this.background.getBGSkills().religion){
            return (this.getIntMod()+this.getProficiency());
        } else {
            return this.getIntMod();
        }
    }
    public int getAnimalHandling(){
        if(this.background.getBGSkills().animalHandling){
            return (this.getWisMod()+this.getProficiency());
        } else {
            return this.getWisMod();
        }
    }
    public int getInsight(){
        if(this.background.getBGSkills().insight){
            return (this.getWisMod()+this.getProficiency());
        } else {
            return this.getWisMod();
        }
    }
    public int getMedicine(){
        if(this.background.getBGSkills().medicine){
            return (this.getWisMod()+this.getProficiency());
        } else {
            return this.getWisMod();
        }
    }
    public int getPerception(){
        if(this.background.getBGSkills().perception){
            return (this.getWisMod()+this.getProficiency());
        } else {
            return this.getWisMod();
        }
    }
    public int getSurvival(){
        if(this.background.getBGSkills().survival){
            return (this.getWisMod()+this.getProficiency());
        } else {
            return this.getWisMod();
        }
    }
    public int getDeception(){
        if(this.background.getBGSkills().deception){
            return (this.getChaMod()+this.getProficiency());
        } else {
            return this.getChaMod();
        }
    }
    public int getIntimidation(){
        if(this.background.getBGSkills().intimidation){
            return (this.getChaMod()+this.getProficiency());
        } else {
            return this.getChaMod();
        }
    }
    public int getPerformance(){
        if(this.background.getBGSkills().performance){
            return (this.getChaMod()+this.getProficiency());
        } else {
            return this.getChaMod();
        }
    }
    public int getPersuasion(){
        if(this.background.getBGSkills().persuasion){
            return (this.getChaMod()+this.getProficiency());
        } else {
            return this.getChaMod();
        }
    }

    //Outros Getters

    public Race getRace() {
        return race;
    }

    public Classy getClassy() {
        return classy;
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

    public int getRaceNumber() {
        return raceNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public int getBGNumber() {
        return BGNumber;
    }

    //Construtor

    public LogicCharacter(String name, String player, int alignment, int strMain, int dexMain, int conMain, int intMain, int wisMain, int chaMain, int level, int race, int classy, int background){
        
        this.name = name;
        this.player = player;
        this.level = level;
        this.alignment = alignment;
        this.raceNumber = race;
        this.classNumber = classy;
        this.BGNumber = background;


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
                this.background = new Acolyte();
            break;
            case 2:
                this.background = new Charlatan();
            break;
            case 3:
                this.background = new Criminal();
            break;
            case 4:
                this.background = new Entertainer();
            break;
            case 5:
                this.background = new FolkHero();
            break;
            case 6:
                this.background = new GuildArtisan();
            break;
            case 7:
                this.background = new Hermit();
            break;
            case 8:
                this.background = new Noble();
            break;
            case 9:
                this.background = new Outlander();
            break;
            case 10:
                this.background = new Sage();
            break;
            case 11:
                this.background = new Sailor();
            break;
            case 12:
                this.background = new Soldier();
            break;
            case 13:
                this.background = new Urchin();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------------------").append("\n");
        sb.append("------- |       Ficha de Personagem       | -------").append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("Nome do personagem: ").append(name).append("   |   ").append("Jogador: ").append(player).append("\n");
        sb.append("Raça: ").append(race.getRaceName()).append("   |   ").append("Classe: ").append(classy.getClassName()).append("\n");
        sb.append("Nível: ").append(level).append("   |   ").append("Alinhamento: ").append(getAlignment()).append("\n");
        sb.append("Antecedente: ").append(background.getBGName()).append("\n");
        sb.append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("------- |            Atributos            | -------").append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("FOR ").append(this.getStrMain()).append("  ( ").append(this.getStrMod()).append(" )").append("\n");
        sb.append("DES ").append(this.getDexMain()).append("  ( ").append(this.getDexMod()).append(" )").append("\n");
        sb.append("CON ").append(this.getConMain()).append("  ( ").append(this.getConMod()).append(" )").append("\n");
        sb.append("INT ").append(this.getIntMain()).append("  ( ").append(this.getIntMod()).append(" )").append("\n");
        sb.append("SAB ").append(this.getWisMain()).append("  ( ").append(this.getWisMod()).append(" )").append("\n");
        sb.append("CAR ").append(this.getChaMain()).append("  ( ").append(this.getChaMod()).append(" )").append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("------- |             Combate             | -------").append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("Pontos de Vida Totais: ").append(this.getMaxHP()).append("\n");
        sb.append("Iniciativa: ").append(this.getDexMod()).append("\n");
        sb.append("Velocidade: ").append(race.getRaceSpeed()).append("m").append("\n");
        sb.append("Classe de Armadura: ").append(classy.getClassAC()).append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("------- |           Habilidades           | -------").append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("Acrobacia ").append(this.getAcrobatics()).append(" (Des)").append("\n");
        sb.append("Arcanismo ").append(this.getArcana()).append(" (Int)").append("\n");
        sb.append("Atletismo ").append(this.getAthletics()).append(" (For)").append("\n");
        sb.append("Atuação ").append(this.getPerformance()).append(" (Car)").append("\n");
        sb.append("Enganação ").append(this.getDeception()).append(" (Car)").append("\n");
        sb.append("Furtividade ").append(this.getStealth()).append(" (Des)").append("\n");
        sb.append("História ").append(this.getHistory()).append(" (Int)").append("\n");
        sb.append("Intimidação ").append(this.getIntimidation()).append(" (Car)").append("\n");
        sb.append("Intuição ").append(this.getInsight()).append(" (Car)").append("\n");
        sb.append("Investigação ").append(this.getInvestigation()).append(" (Int)").append("\n");
        sb.append("Lidar com Animais ").append(this.getAnimalHandling()).append(" (Sab)").append("\n");
        sb.append("Medicina ").append(this.getMedicine()).append(" (Sab)").append("\n");
        sb.append("Natureza ").append(this.getNature()).append(" (Int)").append("\n");
        sb.append("Percepção ").append(this.getPerception()).append(" (Sab)").append("\n");
        sb.append("Persuasão ").append(this.getPersuasion()).append(" (Car)").append("\n");
        sb.append("Prestidigitação ").append(this.getSleighofHand()).append(" (Des)").append("\n");
        sb.append("Religião ").append(this.getReligion()).append(" (Sab)").append("\n");
        sb.append("Sobrevivência ").append(this.getSurvival()).append(" (Sab)").append("\n");
        sb.append("---------------------------------------------------").append("\n");
        sb.append("------- |           Inventário            | -------").append("\n");
        sb.append("---------------------------------------------------").append("\n");

        for (String item : equipment) {
            sb.append(item).append("\n");
        }
        
        sb.append("---------------------------------------------------").append("\n");
        sb.append("------- |             Magias              | -------").append("\n");
        sb.append("---------------------------------------------------").append("\n");

        for (String magic : magics) {
            sb.append(magic).append("\n");
        }

        sb.append("---------------------------------------------------").append("\n");
        
        return sb.toString();
    }
}
