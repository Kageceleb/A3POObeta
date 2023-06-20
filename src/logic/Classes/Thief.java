package logic.Classes;

import java.util.ArrayList;

import logic.Interfaces.Classy;

public class Thief implements Classy {

    private String className = "Ladino";
    private int classHP = 8;
    private int classAC = 14;

    private int classStr = 0;
    private int classDex = 0;
    private int classCon = 0;
    private int classInt = 0;
    private int classWis = 0;
    private int classCha = 0;

    ArrayList<String> classEquipment =  new ArrayList<String>(){
        {
            add("Adaga de Aço x2");
            add("Bomba de Fumaça x3");
            add("Gazuas x12");
            add("Arco Curto");
            add("Flechas x20");
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

    public Thief(int level){
        switch (level) {
            case 20:
                classHP = classHP + 5;
                this.classDex = this.classDex + 1;
                this.classInt = this.classInt + 1;
            case 19:
                classHP = classHP + 5;
            case 18:
                classHP = classHP + 5;
            case 17:
                classHP = classHP + 5;
            case 16:
                classHP = classHP + 5;
                this.classDex = this.classDex + 1;
                this.classInt = this.classInt + 1;
            case 15:
                classHP = classHP + 5;
            case 14:
                classHP = classHP + 5;
            case 13:
                classHP = classHP + 5;
            case 12:
                classHP = classHP + 5;
                this.classDex = this.classDex + 2;
            case 11:
                classHP = classHP + 5;
            case 10:
                classHP = classHP + 5;         
            case 9:
                classHP = classHP + 5;
            case 8:
                classHP = classHP + 5;
                this.classDex = this.classDex + 2;
            case 7:
                classHP = classHP + 5;
            case 6:
                classHP = classHP + 5;
            case 5:
                classHP = classHP + 5;
            case 4:
                classHP = classHP + 5;
                this.classDex = this.classDex + 2;
            case 3:
                classHP = classHP + 5;
            case 2:
                classHP = classHP + 5;
            case 1:

        }

    }
    
}
