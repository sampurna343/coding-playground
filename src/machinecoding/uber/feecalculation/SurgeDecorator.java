package machinecoding.uber.feecalculation;

import machinecoding.uber.entities.TripRequest;
import machinecoding.uber.enums.VehicleType;

public abstract class SurgeDecorator implements FeeCalculationStrategy{

    private FeeCalculationStrategy feeCalculationStrategy;

    SurgeDecorator(FeeCalculationStrategy feeCalculationStrategy){
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    @Override
    public double calculateFee(TripRequest tripRequest) {
        return feeCalculationStrategy.calculateFee(tripRequest) + addSurgePrice();
    }

    public abstract double addSurgePrice();
}
