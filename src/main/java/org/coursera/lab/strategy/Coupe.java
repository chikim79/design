package org.coursera.lab.strategy;

public class Coupe extends Car {

    public Coupe() {
        super(15000, new SportHandling());
    }

    @Override
    String getType() {
        return "coupe";
    }
}
