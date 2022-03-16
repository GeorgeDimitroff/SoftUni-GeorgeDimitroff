package SoftUniPac;

import java.util.Scanner;

public class TriangleOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for the triangle: ");
        int rows = Integer.parseInt(sc.nextLine());

        for(int i=0; i<=rows-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
