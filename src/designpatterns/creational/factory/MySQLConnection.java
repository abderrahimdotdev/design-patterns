package designpatterns.creational.factory;

public class MySQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database.");
    }

}
