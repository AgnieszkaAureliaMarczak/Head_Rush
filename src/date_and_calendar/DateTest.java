package date_and_calendar;

import java.util.Date;

public class DateTest {
    Integer i = 5;
    int j;

    public static void main(String[] args) {
        String s = String.format("%tc", new Date());
        System.out.println(s);

        String s1 = String.format("%tr", new Date());
        System.out.println(s1);

        Date today = new Date();
        String s2 = String.format("%tA, %<tB, %<td", today);
        System.out.println(s2);

        DateTest z = new DateTest();
        z.go();
    }
    private void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
