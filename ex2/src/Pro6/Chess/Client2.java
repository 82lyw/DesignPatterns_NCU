package Pro6.Chess;

public class Client2 {
    public static void main(String args[]) {
        Chess c1,c2,c3,c4;
        SingletonFactory sf = new SingletonFactory();

        c1 = sf.getChess("black");
        c1.play(new Position(1,1));

        c2 = sf.getChess("black");
        c2.play(new Position(9,6));

        c3 = sf.getChess("white");
        c3.play(new Position(2,1));

        c4 = sf.getChess("white");
        c4.play(new Position(6,6));
    }
}
