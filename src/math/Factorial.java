package math;

import java.util.Scanner;

public class Factorial {

    //Approach 2 : Recursive
    static long factRecursive(int n) {
        if(n == 0) return 1;
        return n * factRecursive(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Approach 1 : Iterative
        long result = 1;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        System.out.println("Iterative: " + result);

        //Approach 2 : Recursive
        System.out.println("Recursive: " + factRecursive(n));

        sc.close();
    }
}
