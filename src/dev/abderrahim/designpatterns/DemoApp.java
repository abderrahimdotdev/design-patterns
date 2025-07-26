package dev.abderrahim.designpatterns;

import dev.abderrahim.designpatterns.iterator.custom.iterators.MenuIterator;
import dev.abderrahim.designpatterns.iterator.custom.menu.BreakfastMenu;

public class DemoApp {
    public static void main(String[] args){
        /*
         ************
         * Iterator *
         ************
         */

        // Using a custom Iterator interface:
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        MenuIterator<String> it = breakfastMenu.createIterator();

        while (it.hasNext()) {
            String menuItem = it.next();
            System.out.println(menuItem);
        }

    }
}
