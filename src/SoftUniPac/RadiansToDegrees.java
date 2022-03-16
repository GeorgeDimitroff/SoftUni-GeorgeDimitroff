package SoftUniPac;

import java.util.Scanner;

import static java.lang.Math.PI;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radian = Double.parseDouble(sc.nextLine());
        double degree = radian*180/PI;
        System.out.println(degree);
    }
}
