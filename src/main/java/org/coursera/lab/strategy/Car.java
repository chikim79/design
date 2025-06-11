package org.coursera.lab.strategy;

import org.coursera.lab.strategy.handling.Handling;

public interface Car {

    String getName();
    String getType();
    void handle();
    int getCost();

    // Methods to track decorator counts
    int getUndercoatCount();
    int getSeatCoverCount();
    int getServiceCount();

}
