package pro10.phone;

public class Client {
    public static void main(String args[])
    {
        Phone p;
        p = new Simple();
        p.ring();
        System.out.println("---------------------------");
        Changer c = new Changer(p);
        c.ring();
    }
}
