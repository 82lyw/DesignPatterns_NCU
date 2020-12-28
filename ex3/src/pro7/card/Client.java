package pro7.card;

public class Client {
    public static void main(String args[])
    {
        CardGame cg = new CardGame();

        cg.play(10);
        System.out.println("--------------------------------");
        cg.changeCards();
        cg.play(-5);
        System.out.println("--------------------------------");
        cg.play(25);
        System.out.println("--------------------------------");
        cg.doubleScore(20);
        System.out.println("--------------------------------");
        cg.play(-10);
        System.out.println("--------------------------------");
        cg.peekCards();
        cg.doubleScore(10);
        System.out.println("--------------------------------");
        cg.changeCards();
        cg.play(20);
        System.out.println("--------------------------------");
    }
}
