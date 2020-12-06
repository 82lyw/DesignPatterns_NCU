package Pro4.DataBase;

public class OracleConnection implements Connection {
    @Override
    public void connection() {
        System.out.println("Connect to Oracle.");
    }
}
