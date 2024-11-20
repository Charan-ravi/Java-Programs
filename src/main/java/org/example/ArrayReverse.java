package org.example;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        System.out.println("Before reversing...");
        System.out.println(Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("After reversing...");
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}