
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.digite.kata.Vehicle;

public class JTestVehicle {
	
	@Test
	public void testgetMaxFuel() {
		
		Vehicle w_vehicle = new Vehicle(100);
		
		assertEquals(100, w_vehicle.getMaxFuel());
	}
  
  @Test
	public void testgetRemainingFuel() {
		
		Vehicle w_vehicle = new Vehicle(100);
		
		assertEquals(100, w_vehicle.getRemainingFuel());	
	}
  
  @Test
	public void testSetRemainingFuel() {
		
		Vehicle w_vehicle = new Vehicle(100);
    VehicleFuel w_vehicleFuel = new VehicleFuel();
		
    w_vehicleFuel.setRemainingFuel(w_Vehicle, 40);
    
		assertEquals(40, w_vehicle.getRemainingFuel());	
	}
  
  @Test
	public void testSetReFuel() {
		
		Vehicle w_vehicle = new Vehicle(100);
    VehicleFuel w_vehicleFuel = new VehicleFuel();
		
    w_vehicleFuel.setRemainingFuel(w_Vehicle, 40);
    
    w_vehicleFuel.setReFuel(w_Vehicle);
    
		assertEquals(100, w_vehicle.getRemainingFuel());	
	}
  
  @Test
	public void testAccelerate() {
		
		Vehicle w_vehicle = new Vehicle(100);
    VehicleAction w_vehicleAction = new VehicleAction(100);
    
    w_vehicleAction.accelerate(w_vehicle);
    
    assertEquals(99, w_vehicle.getRemainingFuel());	
	}
  
  	

}
