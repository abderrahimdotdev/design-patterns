package designpatterns.behavioral.iterator.custom.collections;

import designpatterns.behavioral.iterator.custom.iterators.MediaIterator;

public interface Playlist<T> {

    MediaIterator createSequentialIterator();

    MediaIterator createShuffledIterator();

    void add(T media);
}