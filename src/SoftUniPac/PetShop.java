package SoftUniPac;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogPackages = Integer.parseInt(scan.nextLine());
        int catPackages = Integer.parseInt(scan.nextLine());
        double price = dogPackages*2.5 + catPackages*4;
        System.out.println(price + " lv.");
    }
}
