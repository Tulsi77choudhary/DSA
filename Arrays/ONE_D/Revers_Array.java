package DSA.Arrays.ONE_D;

import java.util.Scanner;

public class Revers_Array {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];

       System.out.print("Enter "+ n +" element : ");
        for(int i = 0 ;  i < n; i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("Reversed Array :");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        sc.close();



    }
    
}
