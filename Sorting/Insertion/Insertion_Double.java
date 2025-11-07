package Sorting.Insertion;

import java.util.Scanner;

public class Insertion_Double {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextDouble();
        }
        for(double num : arr){
           System.out.print(num  + ", ");
        }
        
        sc.close();
    }
    public static void Insertion(double[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            double key = arr[i];
            
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
