package com.github.bsferreira.solid.srp.violation;
package com.digite.kata

public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }
    
    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }
}

public class VehicleFuel {

    public void reFuel(Vehicle vehicle){
        vehicle.remainingFuel = vehicle.maxFuel;
    }
    
    public void setRemainingFuel(Vehicle vehicle, final int remainingFuel) {
        vehicle.remainingFuel = remainingFuel;
    }
}

public class VehicleAction {
    public void accelerate(Vehicle vehicle) {
        vehicle.remainingFuel--;
    }
}
