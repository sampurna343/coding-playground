package machinecoding.parkinglot.strategy;

import machinecoding.parkinglot.entity.Ticket;

public class HourlyFeeCalculation implements FeeCalculationStrategy {
    @Override
    public Double calculateFee(Ticket ticket) {
        return 140.0;
    }
}
