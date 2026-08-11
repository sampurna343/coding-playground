package machinecoding.uber.feecalculation;

import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.enums.VehicleType;

public interface FeeCalculationStrategy {
    double calculateFee(TripRequest tripRequest, VehicleType vehicleType);
}
