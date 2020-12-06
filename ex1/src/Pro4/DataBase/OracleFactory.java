package Pro4.DataBase;

public class OracleFactory implements DBFactory {
    @Override
    public Connection getConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement getStatement() {
        return new OracleStatement();
    }
}
