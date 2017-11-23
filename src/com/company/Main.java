package com.company;

public class Main {
    static PistolApp mygun;
    static ShotgunApp mybiggun;
    static GunController controller;

    public static void main(String[] args) {
        //creation of instances
        Shotgun sp = new Shotgun();
        Pistol p = new Pistol();
        mygun = new PistolApp(p);
        mybiggun = new ShotgunApp(sp);
        controller = new GunController();

        controller.guncontrol.safety.setsafety(false);//
        controller.guncontrol.AmmunitionType = "clip";
        controller.guncontrol.aim();//aim our gun to the target
        controller.signal.signaltoshoot(true);//signal to shot in real world pull the triger
        if (mygun.shotlistener.listen(controller.signal.toshot)) {//checking if the signal to shot was given
            mygun.handgun.shoot();//if true then shoot
        }
        if (mybiggun.shotlistener.listen(controller.signal.toshot)) {//checking if the signal to shot was given
            mybiggun.doublehandgun.shoot();//if true then shoot
        }
    }
}
//PS: i haven't used java so i'm just familiar with some basics