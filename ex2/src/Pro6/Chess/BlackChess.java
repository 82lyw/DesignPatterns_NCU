package Pro6.Chess;

public class BlackChess implements Chess {
    private String color;

    public BlackChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void play(Position position) {
        System.out.println("A black chess is located in " + position.getX() + "," + position.getY());
    }
}
