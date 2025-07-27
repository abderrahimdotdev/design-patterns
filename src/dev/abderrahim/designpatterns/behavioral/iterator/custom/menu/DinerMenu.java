package dev.abderrahim.designpatterns.behavioral.iterator.custom.menu;

import dev.abderrahim.designpatterns.behavioral.iterator.custom.iterators.DinerMenuIterator;
import dev.abderrahim.designpatterns.behavioral.iterator.custom.iterators.MenuIterator;

public class DinerMenu implements Menu<String> {

    String[] menuItems = {
            "Vegetarian BLT",
            "Seafood fried rice",
            "Chicken Bacon Casserole",
            "Hotdog",
            "Steamed Veggies and Brown Rice",
            "Pasta" };

    @Override
    public MenuIterator<String> createIterator() {
        return new DinerMenuIterator<>(menuItems);
    }

    public String toString() {
        return "Diner Menu";
    }
}
