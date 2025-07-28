package designpatterns.behavioral.iterator.custom.collections;

import java.util.ArrayList;
import java.util.List;

import designpatterns.behavioral.iterator.custom.entities.Media;
import designpatterns.behavioral.iterator.custom.entities.Song;
import designpatterns.behavioral.iterator.custom.iterators.MediaIterator;
import designpatterns.behavioral.iterator.custom.iterators.SequentialMediaIterator;
import designpatterns.behavioral.iterator.custom.iterators.ShuffledMediaIterator;

public class MusicPlaylist implements Playlist<Song> {

    private List<Media> songs;

    public MusicPlaylist() {
        this.songs = new ArrayList<>();
    }

    @Override
    public MediaIterator createSequentialIterator() {
        return new SequentialMediaIterator(songs);
    }

    @Override
    public MediaIterator createShuffledIterator() {
        return new ShuffledMediaIterator(songs);
    }

    @Override
    public void add(Song song) {
        songs.add(song);
    }
}
