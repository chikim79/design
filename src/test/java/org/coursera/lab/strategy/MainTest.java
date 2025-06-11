package org.coursera.lab.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.coursera.lab.strategy.decorator.SeatCoverDecorator;
import org.coursera.lab.strategy.decorator.ServiceDecorator;
import org.coursera.lab.strategy.decorator.UndercoatDecorator;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void strategyTEst() {
        assertEquals("eases through turn", new Sedan().handlingStrategy.handle());
        assertEquals("makes a tight turn", new Coupe().handlingStrategy.handle());
        assertEquals("skids through a turn", new Convertible().handlingStrategy.handle());
    }

    @Test
    public void testDecoratorConvertible() {
        Car cv2 = new Convertible();
        cv2 = new UndercoatDecorator(cv2);
        cv2 = new SeatCoverDecorator(cv2);
        cv2 = new SeatCoverDecorator(cv2);
        cv2 = new ServiceDecorator(cv2);
        cv2 = new ServiceDecorator(cv2);


        assertEquals("Convertible 1 (add undercoat) (add seat cover) (add seat cover) (add service visits) (add service visits)", cv2.getName());
        assertEquals(21800, cv2.getCost());
    }

    @Test
    public void testDecoratorLimit() {

        assertThrows(IllegalStateException.class, () -> {
            Car cv2 = new Convertible();
            cv2 = new UndercoatDecorator(cv2);
            cv2 = new UndercoatDecorator(cv2);
        });

        assertThrows(IllegalStateException.class, () -> {
            Car cv2 = new Convertible();
            cv2 = new SeatCoverDecorator(cv2);
            cv2 = new SeatCoverDecorator(cv2);
            cv2 = new SeatCoverDecorator(cv2);
            cv2 = new SeatCoverDecorator(cv2);
            cv2 = new SeatCoverDecorator(cv2);
        });

        assertThrows(IllegalStateException.class, () -> {
            Car cv2 = new Convertible();
            cv2 = new ServiceDecorator(cv2);
            cv2 = new ServiceDecorator(cv2);
            cv2 = new ServiceDecorator(cv2);
        });
    }

}
