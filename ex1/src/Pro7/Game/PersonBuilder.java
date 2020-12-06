package Pro7.Game;

public abstract class PersonBuilder {
    protected Person person = new Person();

    public abstract void setHeight();
    public abstract void drawHead();
    public abstract void drawBody();
    public abstract void drawArms();
    public abstract void drawLegs();

    public Person getPerson() {
        return person;
    }
}
