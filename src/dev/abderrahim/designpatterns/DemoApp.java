package dev.abderrahim.designpatterns;

import dev.abderrahim.designpatterns.iterator.builtin.DinerMenu;
import dev.abderrahim.designpatterns.iterator.custom.iterators.MenuIterator;
import dev.abderrahim.designpatterns.iterator.custom.menu.BreakfastMenu;
import dev.abderrahim.designpatterns.singleton.LazySingleton;
import dev.abderrahim.designpatterns.singleton.Singleton;
import dev.abderrahim.designpatterns.state.context.MusicPlayer;

public class DemoApp {
    public static void main(String[] args) {

        {
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

        {
            /*
             *************
             * Singleton *
             *************
             *
             * The Singleton design pattern is a creational pattern that ensures a class has
             * only one instance and provides a global point of access to that instance.
             */

            Singleton singleton = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();

            System.out.println(singleton == singleton2); // OUTPUT: true

            LazySingleton lazySingleton = LazySingleton.getInstance();
            LazySingleton lazySingleton2 = LazySingleton.getInstance();

            System.out.println(lazySingleton == lazySingleton2); // OUTPUT: true

        }

        {
            /*
             *********
             * State *
             *********
             *
             * The State design pattern is a behavioral design pattern that allows an object
             * to change its behavior when its internal state changes. It's particularly
             * useful when an object needs to exhibit different behaviors based on its
             * current state, without resorting to large conditional statements.
             */

            MusicPlayer mp = new MusicPlayer();

            mp.turnUpVolume(); // OUTPUT: Increasing the volume...
            mp.pressPowerButton(); // OUTPUT: Turning off the music player...
            mp.turnUpVolume(); // OUTPUT: Cannot change the volume when the music player is off.
        }

    }
}
