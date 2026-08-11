package machinecoding.uber.drivermatching;

import machinecoding.uber.entities.Driver;
import machinecoding.uber.entities.TripRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    Driver matchDriver(TripRequest tripRequest, List<Driver> drivers);
}
