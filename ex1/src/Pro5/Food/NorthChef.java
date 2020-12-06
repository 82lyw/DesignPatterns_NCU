package Pro5.Food;

public class NorthChef implements Chef {
    @Override
    public Food cook() {
        System.out.println("cooking north food");
        return new Food();
    }
}
