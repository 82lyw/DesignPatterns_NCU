package Pro6.Chess;

public class Client {
    public static void main(String args[]) {
        Chess c1,c2,c3,c4;
        ChessFactory cf = new ChessFactory();

        c1 = cf.getChess("black");
        c1.play(new Position(1,1));

        c2 = cf.getChess("black");
        c2.play(new Position(9,6));

        c3 = cf.getChess("white");
        c3.play(new Position(2,1));

        c4 = cf.getChess("white");
        c4.play(new Position(6,6));
    }
}
