package artoria.time;

import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {

    @Test
    public void testIfUnixTimestampUsingInteger() {
        System.out.println();
        System.out.println("If unix timestamp using Integer. ");
        DateTime dateTime = DateUtils.create(2038, 1, 23);
        System.out.println("The time of unix timestamp is " + dateTime);
        System.out.println("The unix timestamp is " + dateTime.getTimeInSeconds());
        System.out.println("The Integer max is " + Integer.MAX_VALUE);
        System.out.println();
    }

    @Test
    public void testDayOfAndWeekOf() {
        DateTime dateTime = DateUtils.create();
//        dateTime.addMonth(-1).addDay(-1);
//        dateTime.addDayOfWeek(1);
//        dateTime.setDayOfYear(365);
        System.out.println(DateUtils.format(dateTime));
        System.out.println(DateUtils.format(dateTime, "EEEE"));
        System.out.println("Day Of Week: " + dateTime.getDayOfWeek());
        System.out.println("Day Of Week In Month: " + dateTime.getDayOfWeekInMonth());
        System.out.println("Week Of Month: " + dateTime.getWeekOfMonth());
        System.out.println("Week Of Year: " + dateTime.getWeekOfYear());
        System.out.println("Day Of Year: " + dateTime.getDayOfYear());
    }

    @Test
    public void testEquals() {
        System.out.println();

        DateTime dateTime1 = DateUtils.create(1991, 11, 12);
        DateTime dateTime2 = DateUtils.create(1991, 11, 12);
        System.out.println("dateUtils1 equals dateUtils2 is true ? result : " + dateTime1.equals(dateTime2));

        System.out.println();
    }

    @Test
    public void testFormat() {
        System.out.println();

        System.out.println("The method toString(), result : " + DateUtils.create().toString());

        System.out.println();
    }

    @Test
    public void testCreate() throws ParseException {
        System.out.println();

        System.out.println("The method create(), result : " + DateUtils.create().toString());
        System.out.println("The method create(Date), result : " + DateUtils.create(new Date()).toString());
        System.out.println("The method create(Long), result : " + DateUtils.create(new Date().getTime()).toString());
        System.out.println("The method create(Calendar), result : " + DateUtils.create(Calendar.getInstance()));
        System.out.println("The method create(String), result : " + DateUtils.create(DateUtils.create().toString()));
        System.out.println("The method create(String, String), the pattern is \"yyyy-MM-dd HH:mm:ss SSS\", result : "
                + DateUtils.create(DateUtils.create().toString(), "yyyy-MM-dd HH:mm:ss SSS"));
        System.out.println("The method create(1990, 12, 12), result : " + DateUtils.create(1990, 12, 12));
        System.out.println("The method create(1990, 12, 12, 12, 12, 12), result : "
                + DateUtils.create(1990, 12, 12, 12, 12, 12));
        System.out.println("The method create(1990, 12, 12, 12, 12, 12, 12), result : "
                + DateUtils.create(1990, 12, 12, 12, 12, 12, 12));
        System.out.println();
    }

    @Test
    public void testTimestamp() {
        System.out.println();

        System.out.println("The method create().getTimeInMillis(), result : " + DateUtils.create().getTimeInMillis());
        System.out.println("The method create().getTimeInSeconds(), result : " + DateUtils.create().getTimeInSeconds());

        System.out.println();
    }

    @Test
    public void testNew() {
        SimpleDateTime dateTime = new SimpleDateTime();
        System.out.println(dateTime);
        SimpleDateTime dateTime1 = new SimpleDateTime(Calendar.getInstance());
        System.out.println(dateTime1);
        SimpleDateTime dateTime2 = new SimpleDateTime(new Date());
        System.out.println(dateTime2);
    }

}
