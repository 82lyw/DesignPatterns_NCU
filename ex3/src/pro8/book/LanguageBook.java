package pro8.book;

public class LanguageBook implements Discount {
    public double des(double price) {
        System.out.println("Decrease 2 yuan.");
        return price-2;
    }
}
