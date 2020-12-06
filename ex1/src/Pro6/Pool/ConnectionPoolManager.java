package Pro6.Pool;

public class ConnectionPoolManager {

    private static Connection connection = null;
    private static final String url = "url";

    public static Connection getConnection() {
        if(connection == null) {
            connection = new Connection(url);
        }
        return connection;
    }

    private ConnectionPoolManager() {}
}
