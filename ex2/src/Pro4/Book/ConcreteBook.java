package Pro4.Book;

public class ConcreteBook implements Book {
    @Override
    public void borrowBook() {
        System.out.println("Borrow a book!");
    }

    @Override
    public void returnBook() {
        System.out.println("Return a book!");
    }
}
