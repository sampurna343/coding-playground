package machinecoding.uber.feecalculation;

public class RainSurgeDecorator extends SurgeDecorator{

    RainSurgeDecorator(FeeCalculationStrategy feeCalculationStrategy) {
        super(feeCalculationStrategy);
    }

    @Override
    public double addSurgePrice() {
        return 20.0;
    }
}
