package Pro1.CatAndDog;

public class Client {
    public static void main(String args[]) {
        Adapter adapter = new Adapter();
        adapter.setCatTarget(new ConcreteCatTarget());
        adapter.setDogAdaptee(new ConcreteDogAdaptee());
        adapter.catchMouse();
        adapter.cry();

//        CatTarget cat = new ConcreteCatTarget();
//        adapter.setCatTarget(cat);
//        adapter.cry();

//        DogAdaptee dog = new ConcreteDogAdaptee();
//        adapter.setDogAdaptee(dog);
//        adapter.catchMouse();
    }
}
