package ru.artemk.course;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test28 {
    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("y, MMMM-dd !! HH:mm");
    static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    static void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        while (start.isBefore(end)) {
            System.out.print("Работаем с : "+ start.format(dtf1)+". ");
            start = start.plus(p);
            System.out.println("До : "+ start.format(dtf1));

            System.out.print("Отдыхаем с : "+ start.format(dtf2)+". ");
            start = start.plus(d);
            System.out.println("До : "+ start.format(dtf2)+".");

            System.out.println("-----------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        int year = 2022;
        Month month = Month.JANUARY;
        int day = 10;
        int hour = 0;
        int minutes = 0;
        int seconds = 0;

        LocalDateTime ldt1 = LocalDateTime.of(year, month, day, hour, minutes, seconds);
        LocalDateTime ldt2 = LocalDateTime.now();

        Period period = Period.ofDays(5);
        Duration duration = Duration.ofDays(2);

        smena(ldt1, ldt2, period, duration);
    }
}
