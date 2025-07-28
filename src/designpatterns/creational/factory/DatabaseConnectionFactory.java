package designpatterns.creational.factory;

public class DatabaseConnectionFactory {

    private DatabaseConnectionFactory() {
    }

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
            default:
                throw new IllegalArgumentException("Unknown database type: " + dbType);
        }
    }
}
