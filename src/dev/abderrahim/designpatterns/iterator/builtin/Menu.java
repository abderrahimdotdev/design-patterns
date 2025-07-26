package dev.abderrahim.designpatterns.iterator.builtin;

import java.util.Iterator;

public interface Menu<T> extends Iterable<T> {
    Iterator<T> iterator();
}
