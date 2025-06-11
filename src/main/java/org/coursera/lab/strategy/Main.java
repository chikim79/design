package org.coursera.lab.strategy;

import java.util.ArrayList;

/*
    Starting code with Car class for Strategy exercise
    You should refactor to use Strategy for handling
    Keep automatic car object naming as is
    Bruce Montgomery 10/12/24
*/

public class Main {
    public static void main(String[] args) {
        // Create a list of the different car objects
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Sedan());
        cars.add(new Coupe());
        cars.add(new Convertible());
        // call the handle method for all of them
        for (Car c : cars) {
            System.out.print(c.name + " ");
            c.handle();
        }
    }
}

abstract class Car {
    String name;
    int cost;
    Handling handlingStrategy;
    protected static int carCounter = 0;

    Car(int cost, Handling handlingStrategy) {
        carCounter++;
        name = getType() + " " + carCounter;
        this.cost = cost;
        this.handlingStrategy = handlingStrategy;
    }

    abstract String getType();

    public void handle() {
        System.out.println(handlingStrategy.handle());
    }
}
