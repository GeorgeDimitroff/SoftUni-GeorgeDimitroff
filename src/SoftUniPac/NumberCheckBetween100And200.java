package SoftUniPac;

import java.util.Scanner;

public class NumberCheckBetween100And200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if(number < 100)
            System.out.println("Less than 100");
        else if(number > 200)
            System.out.println("Greater than 200");
        else
            System.out.println("Between 100 and 200");
    }
}
