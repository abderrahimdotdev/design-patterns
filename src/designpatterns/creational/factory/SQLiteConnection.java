package designpatterns.creational.factory;

public class SQLiteConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to SQLite database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from SQLite database.");
    }
}
