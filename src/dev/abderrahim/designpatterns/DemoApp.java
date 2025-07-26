package dev.abderrahim.designpatterns;

import dev.abderrahim.designpatterns.iterator.builtin.DinerMenu;
import dev.abderrahim.designpatterns.iterator.custom.iterators.MenuIterator;
import dev.abderrahim.designpatterns.iterator.custom.menu.BreakfastMenu;
import dev.abderrahim.designpatterns.singleton.LazySingleton;
import dev.abderrahim.designpatterns.singleton.Singleton;

public class DemoApp {
    public static void main(String[] args) {

        {
            /*
             ************
             * Iterator *
             ************
             */

            // Using the custom Iterator interface:
            BreakfastMenu breakfastMenu = new BreakfastMenu();
            MenuIterator<String> it = breakfastMenu.createIterator();

            while (it.hasNext()) {
                String menuItem = it.next();
                System.out.println(menuItem);
            }

            // Using the builts-in Iterable and Iterator interfaces:
            DinerMenu dinerMenu = new DinerMenu();

            for (String menuItem : dinerMenu)
                System.out.println(menuItem);

        }
        {
            /*
             *************
             * Singleton *
             *************
             */

            Singleton singleton = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();

            System.out.println(singleton == singleton2); // OUTPUT: true

            LazySingleton lazySingleton = LazySingleton.getInstance();
            LazySingleton lazySingleton2 = LazySingleton.getInstance();

            System.out.println(lazySingleton == lazySingleton2); // OUTPUT: true

        }
        
        {

        }

    }
}
