package machinecoding.uber.feecalculation;

import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.enums.VehicleType;

public class TimeBasedFeeCalculationStrategy implements FeeCalculationStrategy {
    @Override
    public double calculateFee(TripRequest tripRequest) {
        return 0.0;
    }
}
