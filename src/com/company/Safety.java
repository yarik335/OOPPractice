package com.company;

public class Safety { //this is safety catch
    public boolean safety;

    protected void setsafety(boolean temp) {
        this.safety = temp;
        if (!this.safety) {
            System.out.println("You are in danger! Safety is off");
        }
    }
}
