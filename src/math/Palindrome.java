package math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;

        // Step 1: Negative numbers are never palindromes
        if (n < 0) {
            System.out.println(n + " is NOT a Palindrome");
            sc.close();
            return;
        }

        // Step 2: Reverse the number
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;              // extract last digit
            reversed = reversed * 10 + digit;              // shift and append  ← the key line
            n = n / 10;                     // shrink n
        }

        // Step 3: Compare
        if (reversed == original) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }

        sc.close();
    }
}
