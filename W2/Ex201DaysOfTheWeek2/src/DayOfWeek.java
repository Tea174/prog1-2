public enum DayOfWeek {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true),
    SATURDAY(false), SUNDAY(false);

    private final boolean weekday;
    DayOfWeek(boolean weekday) {
        this.weekday = weekday;
    }

    public boolean isWeekday() {
        return weekday;
    }

    @Override
    public String toString() {
        return name() + " (" + (ordinal() + 1) + ", " + "weekday " + " = " + isWeekday()  + ")";
    }
}