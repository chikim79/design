package org.coursera.lab.strategy;

import org.coursera.lab.strategy.handling.SafetyHandling;

public class Sedan extends AbstractCar {

    public Sedan() {
        super(10000, new SafetyHandling());
    }

    @Override
    public String getType() {
        return "Sedan";
    }
}
