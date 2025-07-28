package designpatterns.behavioral.iterator.custom;

import java.time.Duration;
import java.time.LocalDate;

import designpatterns.behavioral.iterator.custom.collections.MoviePlaylist;
import designpatterns.behavioral.iterator.custom.collections.MusicPlaylist;
import designpatterns.behavioral.iterator.custom.entities.Media;
import designpatterns.behavioral.iterator.custom.entities.Movie;
import designpatterns.behavioral.iterator.custom.entities.Song;
import designpatterns.behavioral.iterator.custom.iterators.MediaIterator;

public class Demo {
    public static void main(String[] args) {

        /*
         ************
         * Iterator *
         ************
         *
         * The Iterator design pattern is a behavioral design pattern that provides a
         * way to access the elements of an aggregate object (like a collection or a
         * data structure) sequentially without exposing its underlying representation.
         */

        // Create music playlist and add songs
        MusicPlaylist musicPlaylist = new MusicPlaylist();
        musicPlaylist.add(new Song("Somebody's Watching Me", "Michael Jackson", Duration.ofSeconds(238)));
        musicPlaylist.add(new Song("Castle of Glass", "Linkin Park", Duration.ofSeconds(205)));
        musicPlaylist.add(new Song("The Way I Am", "Eminem", Duration.ofSeconds(293)));
        musicPlaylist.add(new Song("Hit 'Em Up", "2Pac", Duration.ofSeconds(323)));
        musicPlaylist.add(new Song("Careless Whisper", "George Michael", Duration.ofSeconds(300)));
        musicPlaylist.add(new Song("Everything Has Changed", "DJ Bobo", Duration.ofSeconds(296)));

        // Using a sequential playback for songs
        System.out.println("Sequential Playback:");
        MediaIterator sequentialIterator = musicPlaylist.createSequentialIterator();

        while (sequentialIterator.hasNext()) {
            Media song = sequentialIterator.next();
            System.out.println(song);
        }

        
        // Create movies playlist and add movies
        MoviePlaylist moviesPlaylist = new MoviePlaylist();
        moviesPlaylist.add(new Movie("Gladiator", LocalDate.of(2000,5,5), Duration.ofSeconds(9300)));
        moviesPlaylist.add(new Movie("Titanic", LocalDate.of(1997,12,19),Duration.ofSeconds( 11640)));
        moviesPlaylist.add(new Movie("The Godfather", LocalDate.of(1972,3,24), Duration.ofSeconds(10500)));

        // Using a shuffled playback for songs
        System.out.println("\nShuffled Playback:");
        MediaIterator shuffledIterator = moviesPlaylist.createShuffledIterator();

        while (shuffledIterator.hasNext()) {
            Media song = shuffledIterator.next();
            System.out.println(song);
        }

    }
}
