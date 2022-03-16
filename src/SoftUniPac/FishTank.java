package SoftUniPac;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());
        double percentVolume = 1 - percent*0.01;
        double tankVolumeInLetre = ((length*width*height)*0.001)*percentVolume;
        System.out.println(tankVolumeInLetre);
    }
}
