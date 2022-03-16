package SoftUniPac;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AddXminsToTime {
    public static void main(String[] args) {
        System.out.println("Program is used for adding additional minutes to the entered time. In this case the additional minutes are 15.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = Integer.parseInt(sc.nextLine());
        System.out.print("Enter minutes: ");
        int mins = Integer.parseInt(sc.nextLine());
        System.out.print("Enter additional minutes to current entered time: ");
        int additionalMins = Integer.parseInt(sc.nextLine());

        LocalTime time = LocalTime.of(hours, mins);
        LocalTime value = time.plus(additionalMins, ChronoUnit.MINUTES);
        System.out.println("Time with additional 'X' mins: " + value);

        /* of(int hour, int minute)
         * 'hour' parameter is of Integer type and represents the hour of the day. It varies from 0 to 23.
         * 'minutes' parameted is of Integer type and represents the minutes of the hour. In varies from 0 to 59.
         */

        /* plus(long ammountToAdd, TemporalUnit unit)
         * 'plus()' method of a 'LocalTime' class is used to return copy of this 'LocalTime' with specified account of unit added.
         */
    }
}
