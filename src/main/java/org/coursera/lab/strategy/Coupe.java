package org.coursera.lab.strategy;

import org.coursera.lab.strategy.handling.SportHandling;

public class Coupe extends AbstractCar {

    public Coupe() {
        super(15000, new SportHandling());
    }

    @Override
    public String getType() {
        return "Coupe";
    }
}
