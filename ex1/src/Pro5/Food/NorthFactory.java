package Pro5.Food;

public class NorthFactory implements FoodFactory {
    @Override
    public Chef orderFood() {
        return new NorthChef();
    }
}
