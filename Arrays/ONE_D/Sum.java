package DSA.Arrays.ONE_D;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        int sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;

        System.out.println("Sum :" + sum);
        System.out.println("Average: " + avg);
    }
    
}
