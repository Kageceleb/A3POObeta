package logic.Classes;

import java.util.ArrayList;

import logic.Interfaces.Classy;

public class Warrior implements Classy {

    private String className = "Guerreiro";
    private int classHP = 10;
    private int classAC = 17;

    private int classStr = 0;
    private int classDex = 0;
    private int classCon = 0;
    private int classInt = 0;
    private int classWis = 0;
    private int classCha = 0;

    ArrayList<String> classEquipment =  new ArrayList<String>(){
        {
            add("Espada Curta");
            add("Escudo de Madeira");
            add("Arco Longo");
            add("Flechas x20");
            add("Armadura de Talas");
            add("Poção de Vida x3");
        }
    };

    ArrayList<String> classMagics =  new ArrayList<String>(){
        {
            add("Sua classe não usa Magias");
        }
    };

    @Override
    public ArrayList<String> getClassEquipment() {
        return classEquipment;
    }

    @Override
    public ArrayList<String> getClassMagics() {
        return classMagics;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public int getClassHP() {
        return classHP;
    }

    @Override
    public int getClassAC() {
        return classAC;
    }

    @Override
    public int getClassStr() {
        return classStr;
    }

    @Override
    public int getClassDex() {
        return classDex;
    }

    @Override
    public int getClassCon() {
        return classCon;
    }

    @Override
    public int getClassInt() {
        return classInt;
    }

    @Override
    public int getClassWis() {
        return classWis;
    }

    @Override
    public int getClassCha() {
        return classCha;
    }

    public Warrior(int level){
        switch (level) {
            case 20:
                classHP = classHP + 6;
                classEquipment.add("Espada Lendária da Destruição");
                this.classStr = this.classStr + 2;
            case 19:
                classHP = classHP + 6;
            case 18:
                classHP = classHP + 6;
                this.classCon = this.classCon + 1;
            case 17:
                classHP = classHP + 6;
            case 16:
                classHP = classHP + 6;
                this.classStr = this.classStr + 2;
            case 15:
                classHP = classHP + 6;
                classEquipment.add("Martelo de Guerra Lendário");
            case 14:
                classHP = classHP + 6;
                classEquipment.add("Amuleto de Proteção Elemental");
                this.classDex = this.classDex + 1;
            case 13:
                classHP = classHP + 6;
                classEquipment.add("Luvas do Ataque Poderoso");
            case 12:
                classHP = classHP + 6;
                classEquipment.add("Armadura de Placas");
                this.classAC = 20;
                this.classStr = this.classStr + 2;
            case 11:
                classHP = classHP + 6;
            case 10:
                classHP = classHP + 6;
                this.classCon = this.classCon + 1;
            case 9:
                classHP = classHP + 6;
            case 8:
                classHP = classHP + 6;
                classEquipment.add("Espada Bastarda de Impacto");
                this.classStr = this.classStr + 2;
            case 7:
                classHP = classHP + 6;
            case 6:
                classHP = classHP + 6;
                classEquipment.add("Elmo de Resistência");
                this.classCon = this.classCon+ 1;
            case 5:
                classHP = classHP + 6;
                classEquipment.remove("Escudo de Madeira");
                classEquipment.add("Escudo de Aço");
            case 4:
                classHP = classHP + 6;
                this.classStr = this.classStr + 2;
            case 3:
                classHP = classHP + 6;
                classEquipment.add("Espada Longa");
            case 2:
                classHP = classHP + 6;  
            case 1:

        }

    }
    
}
