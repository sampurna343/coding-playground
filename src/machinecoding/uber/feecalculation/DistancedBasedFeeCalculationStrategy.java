package machinecoding.uber.feecalculation;

import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.enums.VehicleType;

public class DistancedBasedFeeCalculationStrategy implements FeeCalculationStrategy{
    @Override
    public double calculateFee(TripRequest tripRequest, VehicleType vehicleType) {
        return 0;
    }
}
