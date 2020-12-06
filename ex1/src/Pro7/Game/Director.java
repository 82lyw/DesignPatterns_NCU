package Pro7.Game;


public class Director {
    private PersonBuilder pb;

    public void setPersonBuilder(PersonBuilder pb) {
        this.pb = pb;
    }

    public Person construct() {
        pb.drawArms();
        pb.drawBody();
        pb.drawHead();
        pb.drawLegs();
        pb.setHeight();
        return pb.getPerson();
    }
}
