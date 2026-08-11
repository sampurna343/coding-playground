package machinecoding.uber.service;

import machinecoding.uber.entities.Driver;
import machinecoding.uber.entities.Trip;
import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.enums.TripStatus;
import machinecoding.uber.enums.VehicleType;

import java.util.List;
import java.util.Map;

public class TripService {
    private List<Trip> trips;
    private DriverUserMatchingService driverUserMatchingService;
    private FeeCalculationService feeCalculationService;

    public Trip bookTrip(TripRequest tripRequest) {
        Driver driver = driverUserMatchingService.matchAndAssignDriver(tripRequest);
        return new Trip(
                tripRequest.getUser(),
                tripRequest.getPickup(),
                tripRequest.getDestination(),
                tripRequest.getVehicleType(),
                tripRequest.getEstimatedPrice(),
                driver,
                TripStatus.DRIVER_ARRIVING);
    }

    public Map<VehicleType,Double> searchTrip(TripRequest tripRequest){
        return feeCalculationService.fetchEstimatedPriceForEachVehicle(tripRequest);
    }

}
