package Pro7.Game;

public class Client {
    public static void main(String args[]) {
        PersonBuilder pb = (PersonBuilder)XMLUtil.getHeight();
        Director director = new Director();
        director.setPersonBuilder(pb);
        Person person = director.construct();
        person.sayHi();
    }
}
