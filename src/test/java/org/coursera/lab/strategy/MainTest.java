package org.coursera.lab.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void strategyTEst() {
        assertEquals("eases through turn", new Sedan().handlingStrategy.handle());
        assertEquals("makes a tight turn", new Coupe().handlingStrategy.handle());
        assertEquals("skids through a turn", new Convertible().handlingStrategy.handle());
    }

}
