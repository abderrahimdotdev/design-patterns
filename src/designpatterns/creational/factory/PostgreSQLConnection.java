package designpatterns.creational.factory;

public class PostgreSQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL database.");
    }
    
}
