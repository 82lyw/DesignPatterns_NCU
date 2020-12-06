package Pro2.DrawGeometry.plan2;

public class RectangleFactory extends FigureFactory {
    @Override
    public Geometry drawFigure() {
        System.out.println("creat a rectangle......");
        return new Rectangle();
    }
}
