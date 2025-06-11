package org.coursera.lab.strategy.handling;

public interface Handling {
    default String handle() {
        return "has undefined handling";
    }
}
