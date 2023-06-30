// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter tha length of the array :");
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                System.out.println("Enter the element "+i+"th index");
                arr[i] = s.nextInt();
            }
            int ans = duplicateElement(arr);
            if(ans == -1){
                System.out.println("There Is No Duplicate Element Found..");
            }else{
                System.out.println("Duplicate Element is : "+ans);
            }
        }
    }

    private static int duplicateElement(int[] arr) {
        //first approach....its working for all edge cases
        /*int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1; */
        //second approach.....its working according to question ie there should be only one duplicate elements and elements are from 1 to n-2 in the given array......
        int sum1 = 0;
        int n = arr.length;
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                sum1 += arr[i];
            }
            // This formula calculates the sum of all numbers from 1 to n-2 using a
            // mathematical formula for the sum of an arithmetic series.
            // int sum2 = ((n-1)*(n-2))/2;
            // this is another way to find the sum of all from 1 to n-2
            int sum2 = 0;
            for (int i = 0; i < n - 1; i++) {
                sum2 += i;
            }
            int ans = sum1 - sum2;
            return ans;
        }else{
            return -1;
        }
    }
}
