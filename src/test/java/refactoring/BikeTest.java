package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BikeTest {

	@Test
    public void testGetGearsCountBrompton() {
        Bike bike = new Brompton("Brompton 1", 1000, 20, 2, 3);
        
        assertEquals(6, bike.getGearsCount());
    }
	
	@Test
    public void testGetGearsCountEBike() {
        Bike bike = new EBike("E-Bike", 1000, 30, 4, 4, 500);
        
        assertEquals(16, bike.getGearsCount());
    }
	
	@Test
    public void testGetGearsCountMountainbike() {
        Bike bike = new Mountainbike("Mountainbike", 1000, 30, 2, 3);
        
        assertEquals(6, bike.getGearsCount());
    }
	
	@Test
    public void testGetBatteryCapacityEBike() {
        Bike bike = new EBike("E-Bike", 1000, 30, 4, 4, 500);
        
        assertEquals(500, bike.getBatteryCapacity());
    }
	
	@Test
    public void testGetBatteryCapacityBrompton() {
        Bike bike = new Brompton("Brompton", 1000, 20, 2, 3);
        
        assertEquals(null, bike.getBatteryCapacity());
    }
	
	@Test
    public void testGetBatteryCapacityMountainbike() {
		Bike bike = new Mountainbike("Mountainbike", 1000, 30, 2, 3);
        
        assertEquals(null, bike.getBatteryCapacity());
    }
}
