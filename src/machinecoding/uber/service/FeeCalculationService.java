package machinecoding.uber.service;

import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.enums.FeeCalculationStrategyType;
import machinecoding.uber.enums.FeeSurgeDecoratorType;
import machinecoding.uber.enums.VehicleType;
import machinecoding.uber.feecalculation.FeeCalculationStrategy;
import machinecoding.uber.feecalculation.FeeCalculationStrategyFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeeCalculationService {

    private FeeCalculationStrategy feeCalculationStrategy;

    public Map<VehicleType, Double> fetchEstimatedPriceForEachVehicle(TripRequest tripRequest) {

        Map<VehicleType, Double> vehicleToFeeMap = new HashMap<>();
        feeCalculationStrategy = FeeCalculationStrategyFactory.getFeeCalculationStrategy(
                FeeCalculationStrategyType.TIME,
                List.of(FeeSurgeDecoratorType.NIGHT, FeeSurgeDecoratorType.RAIN));

        double fee = feeCalculationStrategy.calculateFee(tripRequest);

        Arrays.stream(VehicleType.values()).forEach(singleVehicleType -> {
            vehicleToFeeMap.put(singleVehicleType, singleVehicleType.getPriceMultiplier() * fee);
        });
        return vehicleToFeeMap;
    }
}
