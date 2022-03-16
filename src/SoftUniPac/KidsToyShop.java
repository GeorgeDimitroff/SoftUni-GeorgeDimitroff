package SoftUniPac;

import java.util.Scanner;

public class KidsToyShop {
    public static void main(String[] args) {
        System.out.println("Toy Shop owner calculates if the earnings of one order can get him the wanted vacation after 25% discount (if ordered toys are over 50) and 10% rent.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vacation price: ");
        double vacationPrice = Double.parseDouble(sc.nextLine());
        System.out.print("Enter ordered puzzles number: ");
        int puzzleNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter ordered talking dolls number: ");
        int talkingDollNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter ordered teddybears number: ");
        int teddyBearNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter ordered minions number: ");
        int minionNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter ordered toy trucks number: ");
        int toyTruckNumber = Integer.parseInt(sc.nextLine());

        int totalToysOrdered = puzzleNumber + talkingDollNumber + teddyBearNumber + minionNumber + toyTruckNumber;
        double totalToyPrice = puzzleNumber*2.6 + talkingDollNumber*3 + teddyBearNumber*4.1 + minionNumber*8.2 + toyTruckNumber*2;
        double priceAfterDiscount;
        double finalPriceAfterRent;

        if(totalToysOrdered >= 50){
            priceAfterDiscount = totalToyPrice - totalToyPrice*0.25;
            finalPriceAfterRent = priceAfterDiscount - priceAfterDiscount*0.1;

            if(finalPriceAfterRent > vacationPrice){
                System.out.printf("Yes! %.2f lv left. Owner can go on the wanted vacation.", (finalPriceAfterRent-vacationPrice));
            }
            else{
                System.out.printf("Not enough money! %.2f lv needed for the vacation.", (vacationPrice - finalPriceAfterRent));
            }
        }
        else{
            finalPriceAfterRent = totalToyPrice - totalToyPrice*0.1;

            if(finalPriceAfterRent > vacationPrice){
                System.out.printf("Yes! %.2f lv left. Owner can go on the wanted vacation.", (finalPriceAfterRent-vacationPrice));
            }
            else{
                System.out.printf("Not enough money! %.2f lv needed for the vacation.", (vacationPrice - finalPriceAfterRent));
            }
        }
    }
}
