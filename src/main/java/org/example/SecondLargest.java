package org.example;

//to find the Second-largest element in an Array
public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        int len = arr.length;
        //if there is no second element then return -1
        if (len < 2)
            return -1;
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secMax = max;
                max = j;
            } else if (j < max && j > secMax) secMax = j;
        }
        // if there is no second-largest element
        return (secMax == Integer.MIN_VALUE) ? -1 : secMax;
    }

    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr = {10,10,10};
        System.out.println("The Second largest element is "+getSecondLargest(arr));
    }
}
