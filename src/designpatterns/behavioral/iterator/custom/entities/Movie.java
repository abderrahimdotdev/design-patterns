package designpatterns.behavioral.iterator.custom.entities;

import java.time.Duration;
import java.time.LocalDate;

public class Movie extends Media{

    private final LocalDate releaseDate;

    public Movie(String title, LocalDate releaseDate,Duration duration) {
        super(title, duration);
        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate(){
        return this.releaseDate;
    }

    @Override
    public String toString(){
        String formattedDuration = super.formatDuration(getDuration());
        return "Movie[title="+super.getTitle()+", releaseDate="+this.getReleaseDate()+", duration="+formattedDuration+"]";
    }
}
