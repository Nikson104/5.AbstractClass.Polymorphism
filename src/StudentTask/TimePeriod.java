package StudentTask;

public class TimePeriod {
    private int years;
    private int months;
    private int days;
    private int hours;
    private int minutes;

    public TimePeriod(int years, int months, int days, int hours, int minutes) {
        this.years = years;
        this.months = months;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(years).append(" лет, ")
                .append(months).append(" месяцев,")
                .append(days).append(" дней, ")
                .append(hours).append(" часов, ")
                .append(minutes).append(" минут, ");
        return out.toString();
    }
}