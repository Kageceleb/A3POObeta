package logic.Classes;

import java.util.ArrayList;

import logic.Interfaces.Classy;

public class Warrior implements Classy {

    private String className = "Guerreiro";

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
                this.classStr = this.classStr + 2;
            case 19:

            case 18:
                this.classCon = this.classCon + 1;
            case 17:

            case 16:
                this.classStr = this.classStr + 2;
            case 15:

            case 14:
                this.classDex = this.classDex + 1;
            case 13:

            case 12:
                this.classStr = this.classStr + 2;
            case 11:

            case 10:
                this.classCon = this.classCon + 1;
            case 9:

            case 8:
                this.classStr = this.classStr + 2;
            case 7:

            case 6:
                this.classCon = this.classCon+ 1;
            case 5:

            case 4:
                this.classStr = this.classStr + 2;
            case 3:

            case 2:
                
            case 1:

        }

    }
    
}
