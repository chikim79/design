package org.coursera.lab.strategy;

public class Convertible extends Car {

    public Convertible() {
        super(20000, new RacingHandling());
    }

    @Override
    String getType() {
        return "convertible";
    }
}
