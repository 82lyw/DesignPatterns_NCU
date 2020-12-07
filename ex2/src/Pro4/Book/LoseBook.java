package Pro4.Book;

public class LoseBook extends Changer {
    public LoseBook(Book book) {
        super(book);
        System.out.println("Add losing function!");
    }

    public void lose() {
        System.out.println("Lose a book!");
    }
}
