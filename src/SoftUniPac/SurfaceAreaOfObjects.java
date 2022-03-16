package SoftUniPac;

import java.util.Scanner;

public class SurfaceAreaOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String object = sc.nextLine();
        if(object.equals("square")) {
            double side = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", side*side);
        }
        else if(object.equals("rectangle")){
            double side1 = Double.parseDouble(sc.nextLine());
            double side2 = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", side1*side2);
        }
        else if(object.equals("circle")){
            double radius = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", Math.PI*radius*radius);
        }
        else if(object.equals("triangle")){
            double side = Double.parseDouble(sc.nextLine());
            double height = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", side*height/2);
        }
    }
}
