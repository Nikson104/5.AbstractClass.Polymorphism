package StudentTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentList implements Input, AverageAge {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Dateable[] list;

    public StudentList(int size) {
        list = new Student[size];
    }

    public Dateable[] getList() {
        return list;
    }

    private int averageValue(int[] array) {
        return (int) IntStream.of(array).average().getAsDouble();
    }

    @Override
    public TimePeriod calculate() {
        int[] years = new int[list.length];
        int[] month = new int[list.length];
        int[] days = new int[list.length];
        LocalDate today = LocalDate.now();
        for (int i = 0; i < list.length; i++) {
            years[i] = Period.between(list[i].date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today).getYears();
            month[i] = Period.between(list[i].date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today).getMonths();
            days[i] = Period.between(list[i].date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today).getDays();
        }

        return new TimePeriod(averageValue(years), averageValue(month) ,averageValue(days) , 0,0);
    }

    @Override
    public void read() {
        for (int i = 0; i < list.length; i++) {
            System.out.print("Введите имя студента: ");
            String name = SCANNER.next();
            System.out.println("Введите фамилию студента: ");
            String surname = SCANNER.next();
            System.out.println("Введите дату рождения (dd-MM-yyyy): ");
            Date date = parse(SCANNER.next());
            list[i] = new Student(date, name, surname);
        }
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}