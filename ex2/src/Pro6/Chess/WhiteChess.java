package Pro6.Chess;

public class WhiteChess implements Chess {
    private String color;

    public WhiteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void play(Position position) {
        System.out.println("A white chess is located in " + position.getX() + "," + position.getY());
    }
}
