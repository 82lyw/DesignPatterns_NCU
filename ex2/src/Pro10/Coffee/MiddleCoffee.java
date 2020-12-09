package Pro10.Coffee;

public class MiddleCoffee extends Coffee {
    @Override
    public void drink() {
        String type = "Middle coffee";
        this.milk.add(type);
    }
}
