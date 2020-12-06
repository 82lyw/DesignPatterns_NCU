package Pro2.DrawGeometry.plan1;
import java.io.IOException;

public class FigureFactory {
    public static Geometry drawFigure(String FigureType) throws Exception {
        switch (FigureType){
            case "Circle":
                System.out.println("creat a circle......");
                return new Circle();
            case "Rectangle":
                System.out.println("creat a rectangle......");
                return new Rectangle();
            case "Square":
                System.out.println("creat a square......");
                return new Square();
            default:
                throw new IOException("Wrong argument!");
        }
    }
}
