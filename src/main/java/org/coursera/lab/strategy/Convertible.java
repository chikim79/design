package org.coursera.lab.strategy;

import org.coursera.lab.strategy.handling.RacingHandling;

public class Convertible extends AbstractCar {

    public Convertible() {
        super(20000, new RacingHandling());
    }

    @Override
    public String getType() {
        return "Convertible";
    }
}
