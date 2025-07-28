package designpatterns.behavioral.iterator.custom.iterators;

import java.util.List;

import designpatterns.behavioral.iterator.custom.entities.Media;

public class SequentialMediaIterator implements MediaIterator {

    private List<Media> songs;
    private int currentIndex = 0;

    public SequentialMediaIterator(List<Media> songs) {
        this.songs = songs;
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
