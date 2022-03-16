package SoftUniPac;

import java.util.Scanner;

public class SquareOfstars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of '*' for the square: ");
        int num = Integer.parseInt(sc.nextLine());
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
