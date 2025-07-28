package designpatterns.creational.factory;

public class DatabaseConnectionFactory {

    private DatabaseConnectionFactory() {
    }

    // Factory method to create database connections
    public static DatabaseConnection getConnection(String dbType) {
        if (dbType == null) {
            return null;
        }
        switch (dbType.toLowerCase()) {
            case "mysql":
                return new MySQLConnection();
            case "postgresql":
                return new PostgreSQLConnection();
            case "sqlite":
                return new SQLiteConnection();
            case "oracle":
                return new OracleDBConnection();
            default:
                throw new IllegalArgumentException("Unknown database type: " + dbType);
        }
    }
}
