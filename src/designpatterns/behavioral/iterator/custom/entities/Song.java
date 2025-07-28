package designpatterns.behavioral.iterator.custom.entities;

import java.time.Duration;

public class Song extends Media {

    private final String artist;

    public Song(String title, String artist, Duration duration) {
        super(title, duration);
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    @Override
    public String toString(){
        String formattedDuration = super.formatDuration(getDuration());
        return "Song[title="+super.getTitle()+", artist="+this.getArtist()+", duration="+formattedDuration+"]";
    }
    
}
