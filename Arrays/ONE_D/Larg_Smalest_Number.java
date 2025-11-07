package ONE_D;

import java.util.Scanner;

public class Larg_Smalest_Number {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
           arr[i]  =  sc.nextInt();

        }

        int min = arr[0];
        int max = arr[0];

        for(int num : arr){
            if(num < min) min = num;
            if(num > max) max = num;
        }

        System.out.println("Smallest number :" + min);
        System.out.println("Largest number:" + max);

        sc.close();

    }

    
}
