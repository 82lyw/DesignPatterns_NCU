package Pro2.DrawGeometry.plan2;

public class CircleFactory extends FigureFactory {
    @Override
    public Geometry drawFigure() {
        System.out.println("creat a circle......");
        return new Circle();
    }
}
