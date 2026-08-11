package machinecoding.parkinglot.decorator;

import machinecoding.parkinglot.strategy.FeeCalculationStrategy;

public class NightFeeSurgeDecoratorImpl extends FeeSurgeDecorator {


    public NightFeeSurgeDecoratorImpl(FeeCalculationStrategy feeCalculationStrategy) {
        super(feeCalculationStrategy);
    }

    @Override
    public Double fetchSurge() {
        return 0.0;
    }
}
