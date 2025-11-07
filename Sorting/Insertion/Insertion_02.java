package Sorting.Insertion;

import java.util.Scanner;

public class Insertion_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];

        for( int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        insrtion(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void insrtion(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n ; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }   
    }
    
}
