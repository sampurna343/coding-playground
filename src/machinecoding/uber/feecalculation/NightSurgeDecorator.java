package machinecoding.uber.feecalculation;

public class NightSurgeDecorator extends SurgeDecorator{

    NightSurgeDecorator(FeeCalculationStrategy feeCalculationStrategy) {
        super(feeCalculationStrategy);
    }

    @Override
    public double addSurgePrice() {
        return 30.0;
    }
}
