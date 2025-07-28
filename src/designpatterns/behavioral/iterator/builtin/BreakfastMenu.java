package designpatterns.behavioral.iterator.builtin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu<String> {

    private final List<String> menuItems;

    public BreakfastMenu(List<String> menuItems) {
        this.menuItems = new ArrayList<>(menuItems);
    }

    public BreakfastMenu(String[] menuItems) {
        this.menuItems = List.of(menuItems);
    }

    public String toString() {
        return "Pancake House Menu";
    }

    @Override
    public Iterator<String> iterator() {
        return menuItems.iterator();
    }
}
