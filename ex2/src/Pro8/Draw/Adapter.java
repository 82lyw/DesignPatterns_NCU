package Pro8.Draw;

public class Adapter extends DrawCircle
{
    private DrawAngle drawAngle = new DrawAngle();
    public Adapter() { }
    public void insert(String msg) {
        drawAngle.insert(msg);
    }
}
