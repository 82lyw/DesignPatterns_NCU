package Pro4.Book;

public class FreezeBook extends Changer {
    public FreezeBook(Book book){
        super(book);
        System.out.println("Add freezing function!");
    }

    public void freeze() {
        System.out.println("Freeze a book!");
    }
}
