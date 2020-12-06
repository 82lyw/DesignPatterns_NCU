package Pro2.DrawGeometry.plan2;

public class Client {
    public static void main(String arg[]) {
        try {
            Geometry geometry;
            FigureFactory fFactory;
            fFactory = (FigureFactory) XMLUtilFigure.getBean();
            geometry = fFactory.drawFigure();
            geometry.draw();
            geometry.erase();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
