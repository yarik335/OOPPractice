package com.company;

public class ShotListener {//this is like a trigger it waits a signal to shot
    static Gun gun;

    public boolean listen(boolean signal) {
        if (signal)
            return true;
        return false;
    }
}
