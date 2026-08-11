package machinecoding.bookmyshow.entities;

import machinecoding.bookmyshow.enums.MovieLanguage;
import machinecoding.bookmyshow.enums.MovieType;

import java.util.List;

public class Movie {
    String movieName;
    MovieLanguage movieLanguage;
    List<MovieType> genres;
    int screenTime;
}
