package Pro7.Game;

public class ShortPersonBuilder extends PersonBuilder {

    @Override
    public void setHeight() {
        person.setHeight("short");
    }

    @Override
    public void drawHead() {
        person.setHead(true);
    }

    @Override
    public void drawBody() {
        person.setBody(true);
    }

    @Override
    public void drawArms() {
        person.setArms(true);
    }

    @Override
    public void drawLegs() {
        person.setLegs(true);
    }
}
