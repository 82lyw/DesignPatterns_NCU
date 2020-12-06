package Pro2.DrawGeometry.plan2;

public class SquareFactory extends FigureFactory {
    @Override
    public Geometry drawFigure() {
        System.out.println("creat a square......");
        return new Square();
    }
}
