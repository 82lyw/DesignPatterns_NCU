package Pro3.AntiVirus;

public class Client {
    public static void main(String args[])
    {
        Element obj1, obj2, obj3, obj4, obj5;
        Folder f1, f2, f3;

        obj1 = new TextFile();
        obj2 = new ImageFile();
        f1 = new Folder();
        f1.add(obj1);
        f1.add(obj2);

        obj3 = new ImageFile();
        obj4 = new ImageFile();
        f2 = new Folder();
        f2.add(obj3);
        f2.add(obj4);

        obj5 = new VideoFile();
        f3 = new Folder();
        f3.add(f1);
        f3.add(f2);
        f3.add(obj5);

        f3.killVirus();
    }
}
