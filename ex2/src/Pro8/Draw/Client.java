package Pro8.Draw;

public class Client {
    public static void main(String[] args)
    {
        DrawCircle dc = (DrawCircle)new Adapter();
        dc.insert("hello world!");
    }
}
