package dev.abderrahim.designpatterns.behavioral.iterator.custom.menu;

import dev.abderrahim.designpatterns.behavioral.iterator.custom.iterators.MenuIterator;

public interface Menu<T> {
    MenuIterator<T> createIterator();
}
