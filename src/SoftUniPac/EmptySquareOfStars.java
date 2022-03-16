package SoftUniPac;

import java.util.Scanner;

public class EmptySquareOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter square width: ");
        int width = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=width; i++){
            for(int j=1; j<=width; j++){
                if(i==1 || i==width)
                    System.out.print("*");
                else if(j==1 || j==width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
