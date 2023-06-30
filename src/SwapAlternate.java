//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
//You don't need to print or return anything, just change in the input array itself.

import java.util.Scanner;

public class SwapAlternate {
    public static void swapElement(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
         // print thr array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter tha length of the array :");
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                System.out.println("Enter the element "+i+"th index");
                arr[i] = s.nextInt();
            }
            swapElement(arr);
        }
    }
}
