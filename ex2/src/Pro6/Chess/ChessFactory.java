package Pro6.Chess;

import java.util.ArrayList;

public class ChessFactory {
    private ArrayList chessList = new ArrayList();

    public ChessFactory() {
        Chess bc = new BlackChess("black");
        chessList.add(bc);
        Chess wc = new WhiteChess("white");
        chessList.add(wc);
    }

    public Chess getChess(String color) {
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
