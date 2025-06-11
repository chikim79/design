package org.coursera.lab.strategy;

public class Sedan extends Car {

    public Sedan() {
        super(10000, new SafetyHandling());
    }

    @Override
    String getType() {
        return "sedan";
    }
}
