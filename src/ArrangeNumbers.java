// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

import java.util.Scanner;

public class ArrangeNumbers {

    public static void arrange(int[] arr, int n) {
        // first approach ............ to solve the problem......T.C = O(n) and S.C = O(1)
        //to print ood part.......
        int n1 = (n - 1) / 2;
        int odd = 1;
        for (int i = 0; i <= n1; i++) {
            arr[i] = odd;
            odd += 2;
        }
        //to print even part...
        
        /*int n2 = (n + 1) / 2;
        int even = 2;
        for (int i = n - 1; i >= n2; i--) {
            arr[i] = even;
            even += 2;
        } */
        
        //another approach to print even part.....
        int even;
        if (n % 2 != 0) {
            even = n - 1;
        } else {
            even = n;
        }
        for (int i = (n + 1) / 2; i < n; i++) {
            arr[i] = even;
            even -= 2;
        }

        //second approach to solve the given problem.....
        /*int left = 0;
        int right = n-1;
        int counter = 1;
        while(left<=right){
            if(counter % 2 == 1){
                arr[left] = counter;
                counter++;
                left++;
            }else{
                arr[right] = counter;
                counter++;
                right--;
            }
        }*/

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
            arrange(arr, n);
        }
    }
}
