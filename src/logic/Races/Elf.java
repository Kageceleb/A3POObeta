package logic.Races;

import logic.Interfaces.Race;

public class Elf implements Race {

    private String raceName = "Elfo";
    private double raceSpeed = 9;

    private int raceStr = 0;
    private int raceDex = 2;
    private int raceCon = 0;
    private int raceInt = 1;
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
