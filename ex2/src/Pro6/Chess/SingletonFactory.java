package Pro6.Chess;

import java.util.ArrayList;

public class SingletonFactory {
    private static ArrayList chessList = null;
    public SingletonFactory() {};

    public static Chess getChess(String color) {
        if(chessList == null) {
            chessList = new ArrayList();
            Chess bc = new BlackChess("black");
            chessList.add(bc);
            Chess wc = new WhiteChess("white");
            chessList.add(wc);
        }

        if(color.equalsIgnoreCase("black")) {
            return (Chess)chessList.get(0);
        }
        else if(color.equalsIgnoreCase("white")) {
            return (Chess)chessList.get(1);
        }
        else {
            return null;
        }
    }
}
