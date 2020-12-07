package Pro1.CatAndDog;

public class Adapter implements CatTarget,DogAdaptee {
    private CatTarget catTarget;
    private DogAdaptee dogAdaptee;

    public Adapter() {}

    public void setCatTarget(CatTarget catTarget) {
        this.catTarget = catTarget;
    }

    public void setDogAdaptee(DogAdaptee dogAdaptee) {
        this.dogAdaptee = dogAdaptee;
    }

    public void catchMouse() {
        System.out.println("狗学猫抓老鼠：");
        this.catTarget.catchMouse();
    }

    public void cry() {
        System.out.println("猫学狗叫：");
        this.dogAdaptee.cry();
    }
}
