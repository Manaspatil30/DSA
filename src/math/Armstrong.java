package math;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;

        //Step 1 : Count digits
        int count = 0;
        int temp = n;
        while (temp > 0){
            count++;
            temp = temp/10;
        }

        //Step 2 & 3: Extract digits and compute sum
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, count);
            n = n/10;
        }


        //Step 4 : Compare
        if(sum == original){
            System.out.println(original + " is a Armstrong Number");
        } else {
            System.out.println(original + " is NOT a Armstrong Number");
        }
        sc.close();
    }
}
