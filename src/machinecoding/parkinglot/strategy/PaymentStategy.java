package machinecoding.parkinglot.strategy;

import machinecoding.parkinglot.entity.Ticket;

public interface PaymentStategy {
    boolean makePayment(Ticket ticket,Double fee);
}
