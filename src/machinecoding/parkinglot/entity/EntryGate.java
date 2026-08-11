package machinecoding.parkinglot.entity;

import machinecoding.parkinglot.service.ParkingLotService;
import machinecoding.parkinglot.service.TicketService;

public class EntryGate implements Gate {
    private int gateId;
    private ParkingLotService parkingLotService;
    private TicketService ticketService;

    public Ticket checkIn(Vehicle vehicle) {
        Spot spot = parkingLotService.assignSpot(vehicle.getVehicleType());
        return ticketService.generateTicket(spot, vehicle);
    }
}
