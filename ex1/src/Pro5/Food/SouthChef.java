package Pro5.Food;

public class SouthChef implements Chef {
    @Override
    public Food cook() {
        System.out.println("cooking south food");
        return new Food();
    }
}
