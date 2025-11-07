package Sorting.Selection;

import java.util.Scanner;

public class Selection_03 {

    public static void Selection(int[] arr){
        int a = arr.length;

        for(int i = 0; i < a - 1; i++){
            int min = i;

            for(int j = i + 1; j < a; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]  arr = new int[n];
         
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Selection(arr);

        for(int num : arr){
            System.out.print(num +"  ");
        }
        sc.close();
    }
}
