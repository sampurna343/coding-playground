package machinecoding.parkinglot.entity;

import machinecoding.parkinglot.service.ParkingLotService;
import machinecoding.parkinglot.strategy.FeeCalculationStrategy;
import machinecoding.parkinglot.strategy.PaymentStategy;

public class ExitGate implements Gate {
    private int gateId;
    FeeCalculationStrategy feeCalculationStrategy;
    PaymentStategy paymentStategy;
    ParkingLotService parkingLotService;

    public void checkOut(Ticket ticket) {
        //time fee calculate
        Double fee = feeCalculationStrategy.calculateFee(ticket);

        //make payment
        Boolean paymentStatus= paymentStategy.makePayment(ticket,fee);

        //release spot
        parkingLotService.releaseSpot(ticket.getAssignedSpot());
    }
}
