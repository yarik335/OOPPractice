package com.company;

public class Shotsignal {
    //this gives a signal to shoot
    boolean toshot = false;

    public boolean signaltoshoot(boolean order) {
        this.toshot = order;
        return toshot;
    }

}
