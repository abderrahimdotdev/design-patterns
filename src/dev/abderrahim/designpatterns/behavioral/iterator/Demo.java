package dev.abderrahim.designpatterns.behavioral.iterator;

import dev.abderrahim.designpatterns.behavioral.iterator.builtin.DinerMenu;
import dev.abderrahim.designpatterns.behavioral.iterator.custom.iterators.MenuIterator;
import dev.abderrahim.designpatterns.behavioral.iterator.custom.menu.BreakfastMenu;

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

        // Using the custom Iterator interface:
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        MenuIterator<String> it = breakfastMenu.createIterator();

        while (it.hasNext()) {
            String menuItem = it.next();
            System.out.println(menuItem);
        }

        // Using the builts-in Iterable and Iterator interfaces allows an object to be
        // the target of the enhanced for statement (sometimes called the "for-each
        // loop" statement):
        DinerMenu dinerMenu = new DinerMenu();

        for (String menuItem : dinerMenu)
            System.out.println(menuItem);
    }
}
