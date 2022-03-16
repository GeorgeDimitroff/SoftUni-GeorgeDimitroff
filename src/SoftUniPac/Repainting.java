package SoftUniPac;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double priceMaterials = (nylon + 2)*1.50 + (paint + 0.1*paint)*14.50 + thinner*5 + 0.40;
        double pricePainter = (priceMaterials*0.3)*hours;
        double totalPrice = pricePainter + priceMaterials;
        System.out.println(totalPrice);
    }
}
