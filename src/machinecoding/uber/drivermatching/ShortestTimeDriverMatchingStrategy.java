package machinecoding.uber.drivermatching;

import machinecoding.uber.entities.Driver;
import machinecoding.uber.entities.TripRequest;

import java.util.List;

public class ShortestTimeDriverMatchingStrategy  implements  DriverMatchingStrategy{
    @Override
    public Driver matchDriver(TripRequest tripRequest, List<Driver> drivers) {
        return drivers.get(0);
    }
}
