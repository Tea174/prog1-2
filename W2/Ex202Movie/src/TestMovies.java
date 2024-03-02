import java.util.ArrayList;
import java.util.List;

public class TestMovies {
    public static void main(String[] args) {
    List<Movie> movieList = List.of(new Movie("Ronin", 1998, Format.DVD, Audio.DOLBY),
        new Movie("Lakeview Terrace", 2008, Format.BLU_RAY, Audio.DOLBY_HD),
        new Movie("Ghost Town", 2008, Format.DVD, Audio.DOLBY),
        new Movie("Stealth", 2005, Format.VHS, Audio.VHS),
        new Movie("Fast & Furious 6", 2013, Format.BLU_RAY, Audio.DTS_HD),
        new Movie("Twilight", 2008, Format.DVD, Audio.DOLBY),
        new Movie("The Brave One", 2007, Format.VHS, Audio.VHS));

     List<Movie> movieListArray = new ArrayList<>(movieList);

        for (Movie movie: movieListArray) {
            System.out.println(movie);

        }

    }
}
