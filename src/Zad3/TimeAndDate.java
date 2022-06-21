package Zad3;


import java.util.Date;
import java.util.Scanner;

public class TimeAndDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date date = new Date();
        System.out.printf("Hours: %tH Minutes: %tM Seconds: %tS%n ", date, date, date);

        System.out.printf("Day: %1$tA Month:  %1$tB Year: %1$tY %n", date, date, date);

        System.out.printf("%1$td.%1$tm.%1$ty %n", date);
    }
}










