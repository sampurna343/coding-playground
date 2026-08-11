package machinecoding.bookmyshow.entities;

import java.util.List;
import java.util.UUID;

public class Booking {
    String bookingID;
    Show show;
    User user;
    List<String> seats;

    public Booking(Show show, User user, List<String> seats) {
        this.bookingID = UUID.randomUUID().toString();
        this.show = show;
        this.user = user;
        this.seats = seats;
    }

    public String getBookingID() {
        return bookingID;
    }

    public Show getShow() {
        return show;
    }

    public User getUser() {
        return user;
    }

    public List<String> getSeats() {
        return seats;
    }
}
