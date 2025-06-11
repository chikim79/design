package org.coursera.lab.strategy.decorator;

import org.coursera.lab.strategy.Car;

public class SeatCoverDecorator implements Car {

    private final Car car;

    public SeatCoverDecorator(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        } else if (car.getSeatCoverCount() >= 4) {
            throw new IllegalStateException("Car can only have up to 4 seat covers");
        }
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName() + " (add seat cover)";
    }

    @Override
    public String getType() {
        return car.getType();
    }

    @Override
    public int getCost() {
        return car.getCost() + 250;
    } // Add cost for seat cover

    @Override
    public void handle() {
        car.handle();
    }

    @Override
    public int getUndercoatCount() {
        return car.getUndercoatCount();
    }

    @Override
    public int getSeatCoverCount() {
        return car.getSeatCoverCount() + 1;
    }

    @Override
    public int getServiceCount() {
        return car.getServiceCount();
    }

}
