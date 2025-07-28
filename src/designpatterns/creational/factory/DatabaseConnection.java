package designpatterns.creational.factory;

/*
 * This interface defines the common operation(s) that all concrete classes must implement.
 */
public interface DatabaseConnection {

    void connect();

    void disconnect();
}
