package Pro9.Car;

public class Client {
    public static void main(String args[]) {
        Transform t;
        t = new Car();
        t.move();
        Airplane a = new Airplane(t);
    }
}
