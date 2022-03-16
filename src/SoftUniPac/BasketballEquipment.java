package SoftUniPac;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearlySubPay = Integer.parseInt(sc.nextLine());
        double shoes = yearlySubPay - yearlySubPay*0.4;
        double equipment = shoes - shoes*0.2;
        double ball = equipment*1/4;
        double accessories = ball*1/5;
        double priceForEquiment = yearlySubPay + shoes + equipment + ball + accessories;
        System.out.println(priceForEquiment);
    }
}
