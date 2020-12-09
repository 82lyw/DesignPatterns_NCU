package Pro10.Coffee;

public class WithoutMilk implements Milk {
    @Override
    public void add(String type) {
        System.out.println(type + " without Milk.");
    }
}
