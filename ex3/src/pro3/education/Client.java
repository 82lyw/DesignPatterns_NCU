package pro3.education;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String args[])
    {
        Student s1, s2, s3, s4, s5;
        s1 = new Student("lyw", 21);
        s2 = new Student("lyc", 21);
        s3 = new Student("lh", 20);
        s4 = new Student("lan", 20);
        s5 = new Student("lq", 22);

        StudentIterator si = new StudentIterator();
        si.addStudent(s1);
        si.addStudent(s2);
        si.addStudent(s3);
        si.addStudent(s4);
        si.addStudent(s5);

        si.display();
    }
}
