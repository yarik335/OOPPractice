package com.company;

public class ShotgunApp {// this is our gun with its listener
    Shotgun doublehandgun;
    ShotListener shotlistener = new ShotListener();

    ShotgunApp(Shotgun shotgun) {
        this.doublehandgun = shotgun;
    }

    public void start() {
    }
}