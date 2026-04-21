package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Read array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0; //start index
        int right = arr.length - 1;  //end index

        while (left < right){
            //Swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            //Move pointers
            left++;
            right--;
        }

        //Print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        sc.close();
    }
}
