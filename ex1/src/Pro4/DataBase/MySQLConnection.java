package Pro4.DataBase;

public class MySQLConnection implements Connection {
    @Override
    public void connection() {
        System.out.println("Connect to MySQL.");
    }
}
