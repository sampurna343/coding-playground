package machinecoding.bookmyshow.entities;

import java.util.List;

public class Theatre {
    String theatreName;
    List<Screen> screens;
    String address;//real life address object class we need to make

    public String getTheatreName() {
        return theatreName;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public String getAddress() {
        return address;
    }
}
