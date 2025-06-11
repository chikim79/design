package org.coursera.lab.strategy;

public interface Handling {
    default String handle() {
        return "has undefined handling";
    }
}
