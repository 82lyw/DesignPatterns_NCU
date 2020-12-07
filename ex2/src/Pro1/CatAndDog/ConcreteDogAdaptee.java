package Pro1.CatAndDog;

public class ConcreteDogAdaptee implements DogAdaptee {
    @Override
    public void cry() {
        System.out.println("汪汪汪......");
    }
}
