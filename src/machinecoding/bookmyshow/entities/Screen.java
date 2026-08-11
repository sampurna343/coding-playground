package machinecoding.bookmyshow.entities;

import machinecoding.bookmyshow.enums.ScreenType;

import java.util.List;

public class Screen {
    int screenNumber;
    List<Seat> seats;
    List<Show> shows;
    ScreenType screenType;

    public int getScreenNumber() {
        return screenNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public ScreenType getScreenType() {
        return screenType;
    }
}
