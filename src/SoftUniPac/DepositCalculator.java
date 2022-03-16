package SoftUniPac;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int depositSum = Integer.parseInt(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        double interestRate = Double.parseDouble(sc.nextLine());
        double totalSum = depositSum + months*((depositSum*(interestRate/100))/12);
        System.out.println(totalSum);
    }
}
