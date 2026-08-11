package machinecoding.parkinglot.decorator;

import machinecoding.parkinglot.entity.Ticket;
import machinecoding.parkinglot.strategy.FeeCalculationStrategy;

public abstract class FeeSurgeDecorator implements FeeCalculationStrategy {

    private final FeeCalculationStrategy calculationStrategy;

    public FeeSurgeDecorator(FeeCalculationStrategy feeCalculationStrategy) {
        this.calculationStrategy = feeCalculationStrategy;
    }

    @Override
    public Double calculateFee(Ticket ticket){
        return calculationStrategy.calculateFee(ticket) + fetchSurge();
    }

    public abstract Double fetchSurge();

}
