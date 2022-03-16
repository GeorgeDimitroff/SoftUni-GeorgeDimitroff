package SoftUniPac;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(sc.nextLine());
        int fishMenu = Integer.parseInt(sc.nextLine());
        int vegetarianMenu = Integer.parseInt(sc.nextLine());
        double priceMenu = chickenMenu*10.35 + fishMenu*12.40 + vegetarianMenu*8.15;
        double priceDesert = priceMenu*0.2;
        double totalPrice = priceDesert + priceMenu + 2.50;
        System.out.println(totalPrice);
    }
}
