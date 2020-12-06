package Pro5.Food;

public class SouthFactory implements FoodFactory {
    @Override
    public Chef orderFood() {
        return new SouthChef();
    }
}
