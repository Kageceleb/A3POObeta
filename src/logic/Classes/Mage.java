package logic.Classes;

import java.util.ArrayList;

import logic.Interfaces.Classy;

public class Mage implements Classy {

    private String className = "Mago";
    private int classHP = 6;

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

    ArrayList<String> classMagics =  new ArrayList<String>();

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

    public Mage(int level){
        switch (level) {
            case 20:
                classHP = classHP + 4;
            case 19:
                classHP = classHP + 4;
            case 18:
                classHP = classHP + 4;
            case 17:
                classHP = classHP + 4;
            case 16:
                classHP = classHP + 4;
            case 15:
                classHP = classHP + 4;
            case 14:
                classHP = classHP + 4;
            case 13:
                classHP = classHP + 4;
            case 12:
                classHP = classHP + 4;
            case 11:
                classHP = classHP + 4;
            case 10:
                classHP = classHP + 4;
            case 9:
                classHP = classHP + 4;
            case 8:
                classHP = classHP + 4;
            case 7:
                classHP = classHP + 4;
            case 6:
                classHP = classHP + 4;
            case 5:
                classHP = classHP + 4;
                classMagics.add("Bola de Fogo");
                classMagics.add("Invisibilidade");
            case 4:
                classHP = classHP + 4;
            case 3:
                classHP = classHP + 4;
                classMagics.add("Armadura Arcana");
            case 2:
                classHP = classHP + 4;
            case 1:
                classMagics.add("Mãos Mágicas");
                classMagics.add("Raio de Gelo");
                classMagics.add("Ilusão Menor");
        }
    }
    
}