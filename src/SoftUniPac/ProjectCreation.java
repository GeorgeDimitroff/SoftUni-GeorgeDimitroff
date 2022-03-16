package SoftUniPac;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        int hours = number*3;
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + number + " project/s.");
    }
}
