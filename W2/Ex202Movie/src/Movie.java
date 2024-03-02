public class Movie {
    private String title;
    private int year;
    private Format format;
    private Audio audio;

    public Movie(String title, int year, Format format, Audio audio) {
        this.title = title;
        this.year = year;
        this.format = format;
        this.audio = audio;
    }

    @Override
    public String toString() {
        return String.format("%-20s%d %-12s%s%n",title, year,format.name(),audio.name());
    }
}
