package machinecoding.parkinglot.strategy;

import machinecoding.parkinglot.entity.Ticket;

public class DailyFeeCalculation implements FeeCalculationStrategy {
    @Override
    public Double calculateFee(Ticket ticket) {
        return 1000.0;
    }
}
