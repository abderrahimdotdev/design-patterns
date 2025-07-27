package designpatterns.behavioral.iterator.custom.menu;

import java.util.Iterator;
import java.util.List;

import designpatterns.behavioral.iterator.custom.iterators.MenuIterator;

public class BreakfastMenu implements Menu<String> {

    private List<String> menuItems = List.of("Belgian Waffles",
            "Two Egg Breakfast",
            "Breakfast Burrito",
            "Jumbo Pancake");

            
    @Override
    public MenuIterator<String> createIterator() {
        return new MenuIterator<String>() {

            private final Iterator<String> it = menuItems.iterator();

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public String next() {
                return it.next();
            }
        };
    }

    public String toString() {
        return "Pancake House Menu";
    }
}
