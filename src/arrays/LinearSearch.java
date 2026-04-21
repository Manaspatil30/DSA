package arrays;

import java.util.Scanner;

public class LinearSearch {
    // Problem : Given an array and a target value, return the index of the target. If not found, return -1.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                index = i;
                break;
            }
        }

        if (index != -1) System.out.println("Found at index: " + index);
        else System.out.println("Not found");

        sc.close();
    }
}
