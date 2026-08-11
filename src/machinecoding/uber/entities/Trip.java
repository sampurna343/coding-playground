package machinecoding.uber.entities;

import machinecoding.uber.enums.TripStatus;
import machinecoding.uber.enums.VehicleType;

public class Trip {
    User user;
    String pickup;
    String destination;
    VehicleType vehicleType;
    Double estimatedPrice;
    Driver driver;
    TripStatus tripStatus;

    public Trip(User user, String pickup, String destination, VehicleType vehicleType, Double estimatedPrice, Driver driver, TripStatus tripStatus) {
        this.user = user;
        this.pickup = pickup;
        this.destination = destination;
        this.vehicleType = vehicleType;
        this.estimatedPrice = estimatedPrice;
        this.driver = driver;
        this.tripStatus = tripStatus;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }
}
