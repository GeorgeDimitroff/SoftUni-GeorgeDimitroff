package SoftUniPac;

import java.util.Scanner;

public class WorkDayOrOffDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week to check if its working or off day: ");
        String text = sc.nextLine();

        switch(text){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":System.out.println("Working day"); break;
            case "Saturday":
            case "Sunday":System.out.println("Weekend"); break;
            default: System.out.println("Error"); break;
        }
    }
}
