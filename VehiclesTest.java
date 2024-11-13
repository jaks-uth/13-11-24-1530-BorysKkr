package pl.example.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiclesTest {

    @Test
    public void testCar() {
        Car car = new Car("Sedan", 4);
        assertEquals(200, car.getMaxSpeed());
        assertEquals(4, car.getDoors());
        assertEquals("Sedan", car.getName());
    }

    @Test
    public void testBike() {
        Bike bike = new Bike("Mountain Bike");
        assertEquals(50, bike.getMaxSpeed());
        assertEquals("Mountain Bike", bike.getName());
    }
}