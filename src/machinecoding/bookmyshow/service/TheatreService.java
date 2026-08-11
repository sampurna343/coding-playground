package machinecoding.bookmyshow.service;

import machinecoding.bookmyshow.entities.City;
import machinecoding.bookmyshow.entities.Screen;
import machinecoding.bookmyshow.entities.Show;
import machinecoding.bookmyshow.entities.Theatre;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TheatreService {
    Map<String, City> cities;

    public List<Theatre> getTheatresByCity(String selectedCityName) {
        City city = cities.get(selectedCityName);
        return city.getTheatreList();
    }

    /**
     *
     * @param selectedTheatreName
     * @param selectedCityName
     * @return List<Show>
     *
     *     TODO: convert it into Java Stream
     */

    public List<Show> getShowsByCityAndTheatre(String selectedTheatreName, String selectedCityName) {

//        List<Show> allShows = getTheatresByCity(selectedCityName).stream()
//                .filter(theatre -> theatre.getTheatreName().equalsIgnoreCase(selectedTheatreName))
//                .flatMap(theatre -> theatre.getScreens().stream())
//                .flatMap(screen -> screen.getShows().stream())
//                .collect(Collectors.toList());

        List<Theatre> theatres = getTheatresByCity(selectedCityName);
        List<Show> allShows = new ArrayList<>();
        for (Theatre theatre : theatres) {
            if (theatre.getTheatreName().equalsIgnoreCase(selectedTheatreName)) {
                for (Screen screen : theatre.getScreens()) {
                    List<Show> shows = screen.getShows();
                    allShows.addAll(shows);
                }
            }
        }
        return allShows;
    }
}

