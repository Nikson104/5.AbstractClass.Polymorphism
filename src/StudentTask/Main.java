package StudentTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentList students = new StudentList(2);
        students.read();
        System.out.println(Arrays.toString(students.getList()));
        System.out.println(students.calculate().toString());
    }
}