//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.
// [1,3,6,3,1] [1,1,2,2,3]

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueElement {
    public static int uniqueElement(int[] arr){

        //first approach......
        /*int n = arr.length;
        for(int i =0;i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j == n){
                return arr[i];
            }
        }
        return -1; */

        //second approach.....
        int n = arr.length;
        if (arr.length == 1) {
            return arr[0]; // Only one element in the array, it is unique
        }
        Arrays.sort(arr);
        for(int i = 0;i<n;i++){
            if(i == 0 && arr[i] != arr[i+1]){
                return arr[i];
            }else if(i == n-1 && arr[i] != arr[i-1]){
                return arr[i];
            }else if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;

        //third approach.....
        /*int ans = 0;
        for(int i =0;i<arr.length;i++){
            ans ^= arr[i];
        }
        return ans; */
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
            int ans = uniqueElement(arr);
            System.out.println("Unique Element is : "+ans);
        }
    }
}
