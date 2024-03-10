package date_and_calendar;

import java.util.Calendar;
import java.util.Locale;

public class LastWorkingDay {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
            calendar.set(currentYear, month, 1);
            calendar.set(currentYear, month, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int daysToGoBack;
            switch (dayOfWeek) {
                case Calendar.SATURDAY -> {
                    daysToGoBack = dayOfWeek - Calendar.FRIDAY;
                    setDateToLastFriday(daysToGoBack, calendar);
                }
                case Calendar.SUNDAY -> {
                    daysToGoBack = 2;
                    setDateToLastFriday(daysToGoBack, calendar);
                }
            }
            displayLastWorkingDay(calendar);
        }
    }

    private static void setDateToLastFriday(int daysToGoBack, Calendar calendar) {
        calendar.add(Calendar.DAY_OF_MONTH, -daysToGoBack);
    }

    private static void displayLastWorkingDay(Calendar calendar) {
        System.out.println("Last working day in " + displayMonthLong(calendar) + " is " + getDayOfMonth(calendar) + " " +
                displayDayOfWeekLong(calendar));
    }

    private static String displayMonthLong(Calendar calendar) {
        return calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
    }

    private static String displayDayOfWeekLong(Calendar calendar) {
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
    }

    private static int getDayOfMonth(Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}
