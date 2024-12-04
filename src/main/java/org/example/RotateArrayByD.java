package org.example;

public class RotateArrayByD {
    public static void rotateByD(int[] arr,int d){
        for (int i = 0; i < d; i++){
            int temp = arr[0];
            for(int j=0;j<arr.length -1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length -1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d =2;
        System.out.println("Before rotating the array with 2 turns: ");
        for(int j:arr){
            System.out.print(" "+j);
        }
        rotateByD(arr,d);
        System.out.println("\n After rotating the array with 2 turns: ");
        for(int j:arr){
            System.out.print(" "+j);
        }
    }
}
