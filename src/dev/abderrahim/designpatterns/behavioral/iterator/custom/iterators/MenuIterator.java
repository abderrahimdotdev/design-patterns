package dev.abderrahim.designpatterns.behavioral.iterator.custom.iterators;

public interface MenuIterator<T> {

    boolean hasNext();
    T next();
}
