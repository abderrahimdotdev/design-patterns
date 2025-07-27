package dev.abderrahim.designpatterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

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

        // Multi-threaded checking:
        try (ExecutorService exe = Executors.newFixedThreadPool(4)) {
            for (int i = 0; i < 4; i++)
                exe.execute(() -> {
                    System.out.println(Singleton.getInstance() == Singleton.getInstance()); // OUTPUT: true
                    System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance()); // OUTPUT: true
                });
        }
    }
}
