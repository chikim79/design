package org.coursera.lab.strategy;

import org.coursera.lab.strategy.handling.Handling;

public abstract class AbstractCar implements Car {
    String name;
    int cost;
    Handling handlingStrategy;
    protected static int carCounter = 0;

    AbstractCar(int cost, Handling handlingStrategy) {
        carCounter++;
        name = getType() + " " + carCounter;
        this.cost = cost;
        this.handlingStrategy = handlingStrategy;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Handling getHandlingStrategy() {
        return handlingStrategy;
    }

    public void handle() {
        System.out.println(handlingStrategy.handle());
    }

    // Base cars have no decorators
    @Override
    public int getUndercoatCount() {
        return 0;
    }

    @Override
    public int getSeatCoverCount() {
        return 0;
    }

    @Override
    public int getServiceCount() {
        return 0;
    }
}
