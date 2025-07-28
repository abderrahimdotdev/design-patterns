package designpatterns.behavioral.iterator.custom.iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import designpatterns.behavioral.iterator.custom.entities.Media;

public class ShuffledMediaIterator implements MediaIterator {

    private List<Media> songs;
    private int currentIndex = 0;

    public ShuffledMediaIterator(List<Media> songs) {
        this.songs = new ArrayList<>(songs);
        Collections.shuffle(this.songs);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < songs.size();
    }

    @Override
    public Media next() {
        if (!hasNext()) {
            return null;
        }
        return songs.get(currentIndex++);
    }
}
