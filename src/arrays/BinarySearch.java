package arrays;

import java.util.Scanner;

public class BinarySearch {
//    Next Problem: Binary Search
//    This is where searching gets powerful. Linear Search is O(n) — Binary Search does the same job in O(log n).
//    The core requirement
//    Binary Search only works on a sorted array. That's the trade-off.
//    Concept — Divide and Conquer
//    Instead of checking every element, check the middle. The middle element tells you which half the target must be in —
//    eliminate the other half entirely. Repeat.

    // Problem: Given a SORTED array and a target, return index or -1.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length -1;
        int index = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) System.out.println("Found at index " + index);
        else System.out.println("Not Found");

        sc.close();
    }
}
