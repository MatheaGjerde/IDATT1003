package oving1;

public class Tid {
    private int timer, minutter, sekunder;

    public Tid(int timer, int minutter, int sekunder) {
        this.timer = timer;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public int tilSekunder() {
        return timer * 3600 + minutter * 60 + sekunder;
    }

    @Override
    public String toString() {
        return timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder";
    }
}