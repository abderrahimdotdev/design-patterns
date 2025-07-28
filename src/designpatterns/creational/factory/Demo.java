package designpatterns.creational.factory;

public class Demo {
    public static void main(String[] args) {

        /*
         ***********
         * Factory *
         ***********
         *
         * The Factory Design Pattern is a creational design pattern that provides an
         * interface for creating objects, but allows subclasses or the client to decide
         * which class to instantiate. This pattern is useful when the exact type of the
         * object to create isn't known until runtime or when you want to provide a
         * centralized place to manage object creation.
         */

        // Create MySQL connection
        DatabaseConnection mySQLConn = DatabaseConnectionFactory.getConnection("mysql");
        mySQLConn.connect();
        mySQLConn.disconnect();

        // Create PostgreSQL connection
        DatabaseConnection postgresConn = DatabaseConnectionFactory.getConnection("postgresql");
        postgresConn.connect();
        postgresConn.disconnect();

        // Create SQLite connection
        DatabaseConnection sqliteConn = DatabaseConnectionFactory.getConnection("sqlite");
        sqliteConn.connect();
        sqliteConn.disconnect();

        // Create SQLite connection
        DatabaseConnection oracleConn = DatabaseConnectionFactory.getConnection("oracle");
        oracleConn.connect();
        oracleConn.disconnect();

        // Handle unknown database types
        try {
            DatabaseConnection unknownConn = DatabaseConnectionFactory.getConnection("mongodb");
            unknownConn.connect();
            unknownConn.disconnect();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
