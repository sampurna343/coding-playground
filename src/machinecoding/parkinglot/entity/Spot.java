package machinecoding.parkinglot.entity;

import machinecoding.parkinglot.enums.SpotStatus;
import machinecoding.parkinglot.enums.VehicleSpotType;

public class Spot {
    private VehicleSpotType vehicleSpotType;
    private String spotId;
    private SpotStatus spotStatus;

    public void occupy() {
        this.spotStatus= SpotStatus.OCCUPIED;
    }

    public void release() {
        this.spotStatus=SpotStatus.AVAILABLE;
    }

    public VehicleSpotType getVehicleSpotType() {
        return vehicleSpotType;
    }
}
