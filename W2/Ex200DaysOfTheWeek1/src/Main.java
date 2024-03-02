public class Main {
    public static void main(String[] args) {
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.TUESDAY;
        DayOfWeek day3 = DayOfWeek.WEDNESDAY;
        DayOfWeek day4 = DayOfWeek.THURSDAY;
        DayOfWeek day5 = DayOfWeek.FRIDAY;
        DayOfWeek day6 = DayOfWeek.SATURDAY;
        DayOfWeek day7 = DayOfWeek.SUNDAY;
        printDay(day1);
        printDay(day2);
        printDay(day3);
        printDay(day4);
        printDay(day5);
        printDay(day6);
        printDay(day7);

    }
    private static void printDay(DayOfWeek day) {
        System.out.println("Day " + (day.ordinal()+1) + " is " + day.name());
    }
}