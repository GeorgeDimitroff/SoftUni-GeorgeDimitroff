package SoftUniPac;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialPoints = Integer.parseInt(sc.nextLine());
        double bonusPoints;
        double finalResult;

        if (initialPoints <= 100){
            bonusPoints = 5;
        }
        else if (initialPoints > 1000) {
            bonusPoints = initialPoints * 0.1;
        }
        else{
            bonusPoints = initialPoints * 0.2;
        }

        if (initialPoints % 2 == 0) {
            bonusPoints+=1;
            finalResult = initialPoints + bonusPoints;
            System.out.println(bonusPoints);
            System.out.println(finalResult);
        }
        else if (initialPoints % 5 == 0){
            bonusPoints+=2;
            finalResult = initialPoints + bonusPoints;
            System.out.println(bonusPoints);
            System.out.println(finalResult);
        }
    }
}
