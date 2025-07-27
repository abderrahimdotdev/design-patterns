package designpatterns.behavioral.iterator.custom.iterators;

import java.util.NoSuchElementException;

public class DinerMenuIterator<T> implements MenuIterator<T> {

    private T[] items;
    private int position = 0;

    public DinerMenuIterator(T[] items) {
        this.items = items.clone();
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public T next() {
        if (position >= items.length)
            throw new NoSuchElementException();

        return items[position++];
    }
}
