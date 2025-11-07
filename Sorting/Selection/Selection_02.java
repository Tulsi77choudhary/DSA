package Sorting.Selection;

import java.util.Scanner;

public class Selection_02 {

    public static void Selection(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minInt = i ; 

            for(int j = i + 1; j < n ; j++){
                if(arr[j] < arr[minInt]){
                    minInt = j;
                }
            }

            int temp = arr[minInt];
            arr[minInt] = arr[i];
            arr[i] =temp;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter" + n +" elements : ");
       
        for(int i = 0 ; i < n ; i++){
           arr[i] =  sc.nextInt();
        }
        
        Selection(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
