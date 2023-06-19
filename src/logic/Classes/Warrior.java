package logic.Classes;

import java.util.ArrayList;

import logic.Interfaces.Classy;

public class Warrior implements Classy {

    private String className = "Guerreiro";
    private int classHP = 10;

    private int classStr = 0;
    private int classDex = 0;
    private int classCon = 0;
    private int classInt = 0;
    private int classWis = 0;
    private int classCha = 0;

    ArrayList<String> classEquipment =  new ArrayList<String>(){
        {
            add("item");
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
            case 14:
                classHP = classHP + 6;
                this.classDex = this.classDex + 1;
            case 13:
                classHP = classHP + 6;
            case 12:
                classHP = classHP + 6;
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
                this.classStr = this.classStr + 2;
            case 7:
                classHP = classHP + 6;
            case 6:
                classHP = classHP + 6;
                this.classCon = this.classCon+ 1;
            case 5:
                classHP = classHP + 6;
            case 4:
                classHP = classHP + 6;
                this.classStr = this.classStr + 2;
            case 3:
                classHP = classHP + 6;
            case 2:
                classHP = classHP + 6;  
            case 1:

        }

    }
    
}
