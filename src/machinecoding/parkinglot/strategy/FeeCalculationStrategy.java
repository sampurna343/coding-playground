package machinecoding.parkinglot.strategy;

import machinecoding.parkinglot.entity.Ticket;

public interface FeeCalculationStrategy {
    Double calculateFee(Ticket ticket);
}
