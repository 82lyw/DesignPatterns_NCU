package Pro4.DataBase;

public interface DBFactory {
    public Connection getConnection();
    public Statement getStatement();
}
