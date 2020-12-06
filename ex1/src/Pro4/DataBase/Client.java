package Pro4.DataBase;

public class Client {
    public static void main(String args[]) {
        try{
            DBFactory dbFactory;
            Connection con;
            Statement st;
            dbFactory = (DBFactory)XMLUtilDB.getDB();
            con = dbFactory.getConnection();
            st = dbFactory.getStatement();
            con.connection();
            st.statement();

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
