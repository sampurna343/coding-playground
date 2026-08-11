package machinecoding.bookmyshow.entities;

import machinecoding.bookmyshow.enums.SeatType;

public class Seat {
    String row;
    int column;
    SeatType seatType;

    public String getSeatNumber() {
        return row + column;
    }
}
