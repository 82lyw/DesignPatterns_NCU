package Pro10.Coffee;

public class BigCoffee extends Coffee {
    @Override
    public void drink() {
        String type = "Big coffee";
        this.milk.add(type);
    }
}
