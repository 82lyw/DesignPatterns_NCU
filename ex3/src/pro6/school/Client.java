package pro6.school;

public class Client {
    public static void main(String args[]) {
        AbstractSchool dep = new Department("Computer Science");

        AbstractObserver to,so;
        to = new Teacher("Mr.Wu",711,dep.getName());
        so = new Student("LYW",610,dep.getName());

        dep.attach(to);
        dep.attach(so);

        to.show();
        so.show();

        System.out.println("更改系名为Data Science");
        dep.changeName("Data Science");
        to.show();
        so.show();
    }
}
