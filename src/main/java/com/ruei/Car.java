package com.ruei;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String ID;
    long Entering;
    long Leaving;


    public Car(String ID){
        this.ID = ID;
        Entering = System.currentTimeMillis();
    }
}
