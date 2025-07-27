package designpatterns.creational.singleton;

/**
 * A lazy-loaded and thread-safe Singleton pattern that doesn't require
 * synchronization. This is one of the most efficient ways to implement a
 * Singleton in Java.
 */

public class Singleton {

    // Private constructor to prevents other classes from instantiating
    private Singleton() {
        // Initialization code goes here
    }

    // A private static nested class InstanceHolder is introduced. This class is not
    // loaded or initialized until it is explicitly referenced because the Java
    // Virtual Machine (JVM) guarantees that static inner classes are initialized in
    // a thread-safe manner.
    private static class InstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        // The singleton object is instantiated only when this method is called, and
        // without synchronization overhead.
        return InstanceHolder.INSTANCE;
    }
}
