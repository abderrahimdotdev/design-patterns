package dev.abderrahim.designpatterns.singleton;

/**
 * A thread-safe Singleton pattern using lazy initialization with double-checked locking.
 * This implementation is useful when thread-safety must be considered and the
 * singleton object is not always needed. However, synchronization implies
 * additional overhead.
 */

public class LazySingleton {

    // Static and volatile reference to hold the one and only instance while
    // maintining visibility across threads.
    private static volatile LazySingleton uniqueInstance;

    // Private constructor to prevents other classes from instantiating
    private LazySingleton() {
        // Initialization code goes here
    }

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (LazySingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
