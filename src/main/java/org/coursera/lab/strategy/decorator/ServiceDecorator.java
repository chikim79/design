package org.coursera.lab.strategy.decorator;

import org.coursera.lab.strategy.Car;

public class ServiceDecorator implements Car {

    private final Car car;

    public ServiceDecorator(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        } else if (car.getServiceCount() >= 2) {
            throw new IllegalStateException("Car can only have up to 2 services");
        }
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName() + " (add service visits)";
    }

    @Override
    public String getType() {
        return car.getType();
    }

    @Override
    public int getCost() {
        return car.getCost() + 400;
    }  // Add cost for service visits

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
        return car.getSeatCoverCount();
    }

    @Override
    public int getServiceCount() {
        return car.getServiceCount() + 1;
    }

}
