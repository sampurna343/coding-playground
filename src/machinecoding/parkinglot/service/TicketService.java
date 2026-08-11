package machinecoding.parkinglot.service;

import machinecoding.parkinglot.entity.Spot;
import machinecoding.parkinglot.entity.Ticket;
import machinecoding.parkinglot.entity.Vehicle;

import java.util.Map;

public class TicketService {
    private Map<String, Ticket> ticketIdToDetails;

    public Ticket generateTicket(Spot spot, Vehicle vehicle) {
        Ticket ticket = new Ticket(vehicle, spot);
        ticketIdToDetails.put(ticket.getTicketId(),ticket);
        return ticket;
    }
}
