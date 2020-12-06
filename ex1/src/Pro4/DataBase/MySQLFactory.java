package Pro4.DataBase;

public class MySQLFactory implements DBFactory {
    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement getStatement() {
        return new MySQLStatement();
    }
}
