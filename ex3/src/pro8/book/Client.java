package pro8.book;

public class Client {
    public static void main(String args[])
    {
        double price = 336;
        System.out.println("Price is " + price);

        Discount discount = (Discount) new NovelBook();
        double newPrice = discount.des(price);
        System.out.println("Price after discount is " + newPrice);
    }
}
