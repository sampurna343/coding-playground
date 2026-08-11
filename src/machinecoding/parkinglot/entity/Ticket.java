package machinecoding.parkinglot.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private String ticketId;
    private Spot assignedSpot;
    private Vehicle assignedVehicle;
    private LocalDateTime entryDateTime;

    public Ticket(Vehicle assignedVehicle, Spot assignedSpot) {
        this.ticketId = UUID.randomUUID().toString();
        this.assignedVehicle = assignedVehicle;
        this.assignedSpot = assignedSpot;
        this.entryDateTime=LocalDateTime.now();
    }

    public String getTicketId() {
        return ticketId;
    }

    public Spot getAssignedSpot() {
        return assignedSpot;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }
}
