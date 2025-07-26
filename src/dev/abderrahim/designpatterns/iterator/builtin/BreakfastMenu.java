package dev.abderrahim.designpatterns.iterator.builtin;

import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu<String> {

    private List<String> menuItems = List.of("Belgian Waffles",
            "Two Egg Breakfast",
            "Breakfast Burrito",
            "Jumbo Pancake");

    public String toString() {
        return "Pancake House Menu";
    }
    
    @Override
    public Iterator<String> iterator() {
        return menuItems.iterator();
    }
}
