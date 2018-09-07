package StudentTask;

import java.util.Date;

public class Student implements Dateable {
    private Date birthDate;
    private String name;
    private String surname;

    public Student(Date birthDate, String name, String surname) {
        this.birthDate = birthDate;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public Date date() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDate=" + birthDate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
