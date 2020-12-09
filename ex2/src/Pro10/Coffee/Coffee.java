package Pro10.Coffee;

public abstract class Coffee {
    protected Milk milk;

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public abstract void drink();
}
