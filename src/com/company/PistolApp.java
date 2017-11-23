package com.company;

public class PistolApp {// this is our gun with its listener
    Pistol handgun;
    ShotListener shotlistener = new ShotListener();

    PistolApp(Pistol pistol) {
        this.handgun = pistol;
    }

    public void start() {
    }
}