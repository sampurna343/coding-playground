package machinecoding.parkinglot.strategy;

import machinecoding.parkinglot.entity.Ticket;

public class CashPayment implements PaymentStategy{
    @Override
    public boolean makePayment(Ticket ticket, Double fee) {
        return true;
    }
}
