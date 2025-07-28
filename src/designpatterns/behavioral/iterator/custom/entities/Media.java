package designpatterns.behavioral.iterator.custom.entities;

import java.time.Duration;

public abstract class Media {
    
    private final String title;
    private final Duration duration;

    protected Media(String title, Duration duration) {
        if(duration == null || duration.toSeconds()<30){
            throw new IllegalArgumentException();
        }

        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public Duration getDuration() {
        return this.duration;
    }
    protected String formatDuration(Duration duration){
        long hours = duration.toHours();
        long minutes = duration.minusHours(duration.toHours()).toMinutes();
        long seconds = duration.minusMinutes(duration.toMinutes()).toSeconds();

        StringBuilder formattedDuration = new StringBuilder("%02d".formatted(seconds));
        
        if(minutes > 0) 
            formattedDuration.insert(0,"%02d:".formatted(minutes));
        if (hours > 0)
            formattedDuration.insert(0,"%02d:".formatted(hours));

        return formattedDuration.toString();
    }
}
