package Sorting.Quick;

import java.util.Scanner;

public class Quick_01 {

    public static void Quick(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            Quick(arr,low, pivot - 1);
            Quick(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr , int low, int high){
        int pivot = arr[high];  
        int i  = low - 1 ;      

        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
            
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter" +  n +" elements : ");
       
        for(int i = 0 ; i < n ; i++){
           arr[i] =  sc.nextInt();
        }
        
        // call mathod
       Quick(arr,0, n - 1);

        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
    
    
}
