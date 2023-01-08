package com.tutorial.datecalendar09;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarApp {
  public static void main(String[] args) {

    Date date = new Date(999390179000L);
    System.out.println(date); // pake current time millis

    Calendar calendar = Calendar.getInstance();

    calendar.set(Calendar.YEAR, 2001);
    calendar.set(Calendar.MONTH, 8); // September
    calendar.set(Calendar.HOUR_OF_DAY, 17);
    calendar.set(Calendar.MINUTE, 15);
    calendar.set(Calendar.SECOND,2);
    calendar.set(Calendar.DAY_OF_MONTH,3);


    System.out.println(calendar.getTime());
    System.out.println(calendar.getTimeInMillis());

  }
}
