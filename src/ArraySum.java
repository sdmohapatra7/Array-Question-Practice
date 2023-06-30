//problem statement
//Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

// time complexity of the code is O(n) and space complexity is O(1) ie, constant cz we dont use any extra space

import java.util.Scanner;

public class ArraySum {

    public static int totalSum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];
        }
        return sum;
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
            int result = totalSum(arr);
            System.out.println("The Sum is :"+result);
        }
    }
}
