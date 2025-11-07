package Sorting.Quick;

import java.util.Scanner;

public class Quick_02 {

    public static void Quicks(int arr[], int low, int high){
        if (low < high) {
            int h =  Quick(arr, low , high);
            Quick(arr, low, h- 1);
            Quick(arr, h + 1, high);

        }
    }

    public static int Quick(int[] arr, int low, int high){
        int h = arr[high];
        int l = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < h){
                l++;

                int temp = arr[l];
                arr[l]  = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l + 1];
        arr[l + 1] = arr[high];
        arr[high] = temp;

        return l + 1;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr ){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
