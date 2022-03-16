package SoftUniPac;

import java.util.Scanner;

public class SuppliesToSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int packOfPens = Integer.parseInt(sc.nextLine());
        int packOfMarkers = Integer.parseInt(sc.nextLine());
        int litersCleaningDetergent = Integer.parseInt(sc.nextLine());
        int discountPercentage = Integer.parseInt(sc.nextLine());
        double price = packOfPens*5.80 + packOfMarkers*7.20 + litersCleaningDetergent*1.20;
        double totalPrice = price -(price*discountPercentage/100);
        System.out.println(totalPrice);
    }
}
