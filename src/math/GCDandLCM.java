package math;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Step 1 : Find GCD using Eulidean algorithm
        int x = a, y = b;
        while (y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;

        //Step 2 : Find LCM using the formula
        long lcm = (long) a * b / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
