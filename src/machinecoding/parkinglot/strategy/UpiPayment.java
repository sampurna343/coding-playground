package machinecoding.parkinglot.strategy;

import machinecoding.parkinglot.entity.Ticket;

public class UpiPayment implements PaymentStategy{
    @Override
    public boolean makePayment(Ticket ticket, Double fee) {
        return true;
    }
}
