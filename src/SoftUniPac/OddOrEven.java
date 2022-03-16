package SoftUniPac;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if(number%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
