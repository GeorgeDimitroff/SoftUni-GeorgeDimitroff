package SoftUniPac;

import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int time1 = Integer.parseInt(sc.nextLine());
        int time2 = Integer.parseInt(sc.nextLine());
        int time3 = Integer.parseInt(sc.nextLine());
        int totalTime = time1 + time2 + time3;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if(seconds < 10)
            System.out.printf("%d:0%d", minutes, seconds);
        else
            System.out.printf("%d:%d", minutes, seconds);
    }
}
