package SoftUniPac;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(sc.nextLine());
        int pagePerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        int hoursPerDay = (numberOfPages/pagePerHour)/days;
        System.out.println(hoursPerDay);
    }
}
