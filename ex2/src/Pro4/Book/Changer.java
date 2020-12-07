package Pro4.Book;

public class Changer implements Book {
    private Book book;
    public Changer(Book book) {
        this.book = book;
    }

    @Override
    public void borrowBook() {
        book.borrowBook();
    }

    @Override
    public void returnBook() {
        book.returnBook();
    }
}
