package dev.abderrahim.designpatterns.iterator.custom.menu;

import dev.abderrahim.designpatterns.iterator.custom.iterators.MenuIterator;

public interface Menu<T> {
    MenuIterator<T> createIterator();
}
