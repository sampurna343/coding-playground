package machinecoding.parkinglot.entity;

import machinecoding.parkinglot.enums.VehicleSpotType;

public class Vehicle { ;
    private VehicleSpotType vehicleSpotType;
    private String vehicleNumber;

    public VehicleSpotType getVehicleType() {
        return vehicleSpotType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
