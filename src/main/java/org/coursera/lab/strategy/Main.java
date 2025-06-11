package org.coursera.lab.strategy;

import org.coursera.lab.strategy.decorator.SeatCoverDecorator;
import org.coursera.lab.strategy.decorator.ServiceDecorator;
import org.coursera.lab.strategy.decorator.UndercoatDecorator;

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


        cars.add(new UndercoatDecorator(new ServiceDecorator(new Sedan())));  // Decorations
        cars.add(new UndercoatDecorator(new Coupe())); // Decorations
        cars.add(new SeatCoverDecorator(new SeatCoverDecorator(new Convertible()))); // Decorations
        // call the handle method for all of them
        for (Car c : cars) {
            System.out.print(c.getName() + " ");
            c.handle();
        }
    }
}

