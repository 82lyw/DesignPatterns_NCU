package Pro10.Coffee;

public class WithMilk implements Milk {
    @Override
    public void add(String type) {
        System.out.println(type + " with Milk.");
    }
}
