package Pro4.Book;

public class Client {
    public static void main(String args[]) {
        Book book;
        book = new ConcreteBook();
        book.returnBook();
        System.out.println();
        FreezeBook fb = new FreezeBook(book);
        fb.freeze();
        LoseBook lb = new LoseBook(book);
        lb.lose();
    }
}
