package Sorting.Bubble;

import java.util.Scanner;

public class Bubble_Sort_02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+ n + " elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        bubble(arr);
      
        for(int num : arr){
           System.out.print(num + " ");
        }
        
        sc.close();
      

    }

    public static void bubble(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0 ; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        } 
    }
}
