package pro5.user;

public class Client {
    public static void main(String args[]) {
        UserInfoDTO user = new UserInfoDTO("LiuYiwen","123456","15979797979");
        Caretaker c = new Caretaker();

        System.out.println("状态一：");
        c.addMemento(user);
        user.show();

        user.setPassword("666666");
        System.out.println("状态二：");
        c.addMemento(user);
        user.show();

        user.setTelNo("16868686812");
        System.out.println("状态三：");
        c.addMemento(user);
        user.show();

        user = c.undo(); //从备忘录中恢复
        System.out.println("回到状态二：");
        user.show();

        user = c.undo(); //从备忘录中恢复
        System.out.println("回到状态一：");
        user.show();
    }
}
