package Pro7.Desktop;

public class Client {
    public static void main(String args[]) {
        AbstractApp aa;
        aa = (AbstractApp)new Picture();
        aa.run();
    }
}
