package pro9.book2;

import pro4.un.Country;

public class Client {
    public static void main(String args[]) {
        OnlineStore on = new OnlineStore();
        Member[] m = new Member[3];
        m[0] = new Member("LYW");
        m[1] = new Member("Lily");
        m[2] = new Member("Lucy");
        on.attach(m[0]);
        on.attach(m[1]);
        on.attach(m[2]);

        on.updateName();
        System.out.println("--------------------------------");
        on.updatePrice();
    }
}
