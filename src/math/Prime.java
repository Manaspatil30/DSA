package math;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Step 1 : Base Cases
        if(n <= 1){
            System.out.println(n + " is NOT Prime");
            sc.close();
            return;
        }

        //Step 2 : Check Divisors up to root of n
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        //Step 3 : Result
        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is NOT Prime");
        }

        sc.close();
    }
}
