package dev.abderrahim.designpatterns.creational.singleton;

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
    }
}
