package machinecoding.uber.entities;

import machinecoding.uber.enums.VehicleType;

public class TripRequest {
    User user;
    String pickup;
    String destination;
    VehicleType vehicleType;
    Double estimatedPrice;

    public TripRequest(User user, String pickup, String destination) {
        this.user = user;
        this.pickup = pickup;
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Double getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setEstimatedPrice(Double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }
}
