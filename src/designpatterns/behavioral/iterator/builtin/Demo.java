package designpatterns.behavioral.iterator.builtin;

import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        /*
         ************
         * Iterator *
         ************
         *
         * The Iterator design pattern is a behavioral design pattern that provides a
         * way to access the elements of an aggregate object (like a collection or a
         * data structure) sequentially without exposing its underlying representation.
         */

        String[] dinerMenuItems = { "Vegetarian BLT", "Seafood fried rice", "Chicken Bacon Casserole", "Hotdog",
                "Steamed Veggies and Brown Rice", "Pasta" };

        DinerMenu dinerMenu = new DinerMenu(dinerMenuItems);

        /*
         * Using the builts-in Iterable and Iterator interfaces — implemented by
         * DinerMenu
         * and DinerMenuIterator respectively — allows an object to be the target of the
         * enhanced for statement (sometimes called the "for-each loop" statement):
         */

        for (String menuItem : dinerMenu)
            System.out.println(menuItem);

        System.out.println();

        List<String> breakfastMenuItems = List.of("Belgian Waffles",
                "Two Egg Breakfast",
                "Breakfast Burrito",
                "Jumbo Pancake");

        BreakfastMenu breakfastMenu = new BreakfastMenu(breakfastMenuItems);
        Iterator<String> breakfastMenuIterator = breakfastMenu.iterator();

        while (breakfastMenuIterator.hasNext()) {
            String item = breakfastMenuIterator.next();
            System.out.println(item);
        }

    }
}
