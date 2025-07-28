package designpatterns.creational.factory;

public class OracleDBConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle database.");
    }
}
