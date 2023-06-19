package logic.Races;

import logic.Interfaces.Race;

public class Dwarf implements Race {

    private String raceName = "Anão";
    private double raceSpeed = 7.5;

    private int raceStr = 2;
    private int raceDex = 0;
    private int raceCon = 2;
    private int raceInt = 0;
    private int raceWis = 0;
    private int raceCha = 0;

    @Override
    public String getRaceName() {
        return raceName;
    }

    @Override
    public double getRaceSpeed() {
        return raceSpeed;
    }

    @Override
    public int getRaceStr() {
        return raceStr;
    }

    @Override
    public int getRaceDex() {
        return raceDex;
    }

    @Override
    public int getRaceCon() {
        return raceCon;
    }

    @Override
    public int getRaceInt() {
        return raceInt;
    }

    @Override
    public int getRaceWis() {
        return raceWis;
    }

    @Override
    public int getRaceCha() {
        return raceCha;
    }
    
}
