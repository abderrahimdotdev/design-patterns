package dev.abderrahim.designpatterns.iterator.custom.iterators;

public interface MenuIterator<T> {

    boolean hasNext();
    T next();
}
