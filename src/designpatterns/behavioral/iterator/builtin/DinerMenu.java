package designpatterns.behavioral.iterator.builtin;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class DinerMenu implements Menu<String> {

    private final String[] menuItems;

    public DinerMenu(List<String> menuItems) {
        this.menuItems = menuItems.toArray(String[]::new);
    }

    public DinerMenu(String[] menuItems) {
        this.menuItems = menuItems.clone();
    }

    @Override
    public Iterator<String> iterator() {
        return new DinerMenuIterator<>(menuItems);
    }

    private class DinerMenuIterator<T> implements Iterator<T> {

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

    public String toString() {
        return "Diner Menu";
    }
}