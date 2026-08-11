package machinecoding.uber.service;

import machinecoding.uber.drivermatching.DriverMatchingStrategyFactory;
import machinecoding.uber.entities.Driver;
import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.drivermatching.DriverMatchingStrategy;
import machinecoding.uber.enums.DriverMatchingStrategyType;

import java.util.List;

public class DriverUserMatchingService {
    DriverService driverService;
    DriverMatchingStrategy driverMatchingStrategy;

    Driver matchAndAssignDriver(TripRequest tripRequest) {
        List<Driver> drivers = driverService.getDrivers();
        driverMatchingStrategy = DriverMatchingStrategyFactory
                .getStrategy(tripRequest.getUser().getDriverMatchingStrategyType());
        Driver driver = driverMatchingStrategy.matchDriver(tripRequest, drivers);
        return driver;
    }
}
