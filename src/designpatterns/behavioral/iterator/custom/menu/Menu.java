package designpatterns.behavioral.iterator.custom.menu;

import designpatterns.behavioral.iterator.custom.iterators.MenuIterator;

public interface Menu<T> {
    MenuIterator<T> createIterator();
}
