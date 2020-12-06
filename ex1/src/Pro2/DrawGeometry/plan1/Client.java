package Pro2.DrawGeometry.plan1;

public class Client {
    public static void main(String arg[]) {
        try {
            Geometry geometry;
            String brandName = XMLUtilFigure.getBrandName();
            geometry = FigureFactory.drawFigure(brandName);
            geometry.draw();
            geometry.erase();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
