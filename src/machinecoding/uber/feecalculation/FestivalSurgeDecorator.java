package machinecoding.uber.feecalculation;

public class FestivalSurgeDecorator extends SurgeDecorator{

    FestivalSurgeDecorator(FeeCalculationStrategy feeCalculationStrategy) {
        super(feeCalculationStrategy);
    }

    @Override
    public double addSurgePrice() {
        return 10.0;
    }
}
