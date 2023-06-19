package logic.Races;

import logic.Interfaces.Race;

public class Human implements Race {

    private String raceName = "Humano";

    private int raceStr = 1;
    private int raceDex = 1;
    private int raceCon = 1;
    private int raceInt = 1;
    private int raceWis = 1;
    private int raceCha = 1;

    @Override
    public String getRaceName() {
        return raceName;
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
