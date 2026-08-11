package machinecoding.parkinglot.decorator;

import machinecoding.parkinglot.strategy.FeeCalculationStrategy;

public class FestivalFeeSurgeDecoratorImpl extends FeeSurgeDecorator{


    public FestivalFeeSurgeDecoratorImpl(FeeCalculationStrategy feeCalculationStrategy) {
        super(feeCalculationStrategy);
    }

    @Override
    public Double fetchSurge() {
        return 100.0;
    }
}
