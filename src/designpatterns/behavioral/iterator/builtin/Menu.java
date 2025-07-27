package designpatterns.behavioral.iterator.builtin;

import java.util.Iterator;

public interface Menu<T> extends Iterable<T> {
    Iterator<T> iterator();
}
