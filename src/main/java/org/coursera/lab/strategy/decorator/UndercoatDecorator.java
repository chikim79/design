package org.coursera.lab.strategy.decorator;

import org.coursera.lab.strategy.Car;

public class UndercoatDecorator implements Car {

    private final Car car;

    public UndercoatDecorator(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        } else if (car.getUndercoatCount() >= 1) {
            throw new IllegalStateException("Car already has an undercoat");
        }
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName() + " (add undercoat)";
    }

    @Override
    public String getType() {
        return car.getType();
    }

    @Override
    public int getCost() {
        return car.getCost() + 500; // Add cost for undercoat
    }

    @Override
    public void handle() {
        car.handle();
    }

    @Override
    public int getUndercoatCount() {
        return car.getUndercoatCount() + 1;
    }

    @Override
    public int getSeatCoverCount() {
        return car.getSeatCoverCount();
    }

    @Override
    public int getServiceCount() {
        return car.getServiceCount();
    }

}
