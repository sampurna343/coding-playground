package machinecoding.bookmyshow.service;

import machinecoding.bookmyshow.entities.Booking;
import machinecoding.bookmyshow.entities.Show;
import machinecoding.bookmyshow.entities.User;
import machinecoding.bookmyshow.enums.SeatStatus;

import java.util.List;
import java.util.Map;

public class BookingService {
    Map<String, Booking> bookings;


    public Booking book(Show show, List<String> selectedSeatNumbers, User user) throws InterruptedException {
        boolean isSeatsBlocked = show.blockSeats(selectedSeatNumbers);
        if (isSeatsBlocked) {
            Booking booking = new Booking(show, user, selectedSeatNumbers);
            bookings.put(booking.getBookingID(), booking);
            return booking;
        }
        return null;
    }
}
