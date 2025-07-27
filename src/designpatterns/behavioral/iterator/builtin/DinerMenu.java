package designpatterns.behavioral.iterator.builtin;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenu implements Menu<String> {

    String[] menuItems = {
            "Vegetarian BLT",
            "Seafood fried rice",
            "Chicken Bacon Casserole",
            "Hotdog",
            "Steamed Veggies and Brown Rice",
            "Pasta" };


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